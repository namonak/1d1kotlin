package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No2096 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val prevMax = IntArray(3)
        val nextMax = IntArray(3)
        val prevMin = IntArray(3)
        val nextMin = IntArray(3)

        // 첫 줄 초기화
        run {
            val st = StringTokenizer(input.readLine())
            for (i in 0 until 3) {
                val num = st.nextToken().toInt()
                prevMax[i] = num
                prevMin[i] = num
            }
        }

        // 이후 줄 처리 (롤링 배열)
        repeat(n - 1) {
            val st = StringTokenizer(input.readLine())
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            val c = st.nextToken().toInt()

            // 최대 점수 업데이트
            nextMax[0] = a + maxOf(prevMax[0], prevMax[1])
            nextMax[1] = b + maxOf(prevMax[0], prevMax[1], prevMax[2])
            nextMax[2] = c + maxOf(prevMax[1], prevMax[2])

            // 최소 점수 업데이트
            nextMin[0] = a + minOf(prevMin[0], prevMin[1])
            nextMin[1] = b + minOf(prevMin[0], prevMin[1], prevMin[2])
            nextMin[2] = c + minOf(prevMin[1], prevMin[2])

            // 다음 행을 위해 교체
            for (i in 0..2) {
                prevMax[i] = nextMax[i]
                prevMin[i] = nextMin[i]
            }
        }

        // 최종 결과 (n=1일 때도 prev 배열이 첫 줄 값을 담고 있음)
        val maxScore = prevMax.maxOrNull()!!
        val minScore = prevMin.minOrNull()!!
        return "$maxScore $minScore"
    }
}
