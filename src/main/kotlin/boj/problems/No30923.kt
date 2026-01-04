package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.min

class No30923 {
    fun solve(input: BufferedReader): String {
        // 1. 입력 파싱
        val n = input.readLine().toInt()
        val st = StringTokenizer(input.readLine())

        val heights = IntArray(n) { st.nextToken().toInt() }

        // 2. 겉넓이 계산
        // 높이의 합이 Int 범위를 넘을 수 있으므로 Long 사용
        var totalArea: Long = 0

        for (i in 0 until n) {
            val currentHeight = heights[i]

            // 기본 겉넓이 추가: (높이 * 4) + (위 + 아래)
            totalArea += (currentHeight * 4L) + 2

            // 이전 블록이 있다면 겹치는 부분 차감
            if (i > 0) {
                val prevHeight = heights[i - 1]
                // 두 블록이 맞닿으면서 양쪽 면이 모두 사라지므로 (겹치는 높이 * 2) 차감
                val overlapHeight = min(prevHeight, currentHeight)
                totalArea -= (overlapHeight * 2L)
            }
        }

        return totalArea.toString()
    }
}
