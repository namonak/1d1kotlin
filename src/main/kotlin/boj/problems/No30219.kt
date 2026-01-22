package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class No30219 {
    private data class Point(val x: Long, val y: Long)

    fun solve(input: BufferedReader): String {
        val n = input.readLine()?.trim()?.toInt() ?: return ""
        val points = Array(3 * n) {
            val st = StringTokenizer(input.readLine())
            Point(st.nextToken().toLong(), st.nextToken().toLong())
        }

        // 모든 가능한 삼각형의 면적(2배수 정수값)을 미리 계산 (Optional optimization)
        // 여기서는 가독성을 위해 백트래킹 내부에서 직접 계산합니다.
        val minDiff = backtrack(
            n = n,
            points = points,
            mask = 0,
            currentMin = Long.MAX_VALUE,
            currentMax = Long.MIN_VALUE
        )

        // 결과값은 (maxArea2 - minArea2) / 2.0
        // .0 또는 .5로만 끝나므로 별도의 복잡한 반올림 로직 없이 %.1f로 충분합니다.
        return "%.1f".format(minDiff / 2.0)
    }

    private fun backtrack(
        n: Int,
        points: Array<Point>,
        mask: Int,
        currentMin: Long,
        currentMax: Long
    ): Long {
        // 모든 점을 다 사용했을 때 (기저 사례)
        if (mask == (1 shl (3 * n)) - 1) {
            return currentMax - currentMin
        }

        var res = Long.MAX_VALUE

        // 중복 조합을 피하기 위해 '아직 사용하지 않은 가장 작은 인덱스'를 첫 번째 정점으로 선택
        val first = (0 until 3 * n).first { i -> (mask and (1 shl i)) == 0 }
        val newMaskAfterFirst = mask or (1 shl first)

        // 나머지 두 점을 선택 (first < j < k)
        for (j in (first + 1) until (3 * n)) {
            if ((newMaskAfterFirst and (1 shl j)) != 0) continue
            val newMaskAfterSecond = newMaskAfterFirst or (1 shl j)

            for (k in (j + 1) until (3 * n)) {
                if ((newMaskAfterSecond and (1 shl k)) != 0) continue

                // 신발끈 공식으로 삼각형 넓이의 2배를 구함 (항상 정수)
                val area2 = calculateArea2(points[first], points[j], points[k])

                val nextMin = min(currentMin, area2)
                val nextMax = max(currentMax, area2)

                // 재귀 호출
                val diff = backtrack(
                    n,
                    points,
                    newMaskAfterSecond or (1 shl k),
                    nextMin,
                    nextMax
                )

                res = min(res, diff)
            }
        }

        return res
    }

    /**
     * 신발끈 공식을 이용해 삼각형 넓이의 2배를 반환합니다.
     * |x1(y2-y3) + x2(y3-y1) + x3(y1-y2)|
     */
    private fun calculateArea2(
        p1: Point,
        p2: Point,
        p3: Point
    ): Long {
        return abs(
            p1.x * (p2.y - p3.y) +
                p2.x * (p3.y - p1.y) +
                p3.x * (p1.y - p2.y)
        )
    }
}
