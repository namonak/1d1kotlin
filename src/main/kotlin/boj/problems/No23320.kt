package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No23320 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        val scores = IntArray(n)
        run {
            val st = StringTokenizer(input.readLine())
            for (i in 0 until n) {
                scores[i] = st.nextToken().toInt()
            }
        }

        val st = StringTokenizer(input.readLine())
        val x = st.nextToken().toInt() // 상대평가 A 비율
        val y = st.nextToken().toInt() // 절대평가 A 최소 점수

        // 1. 상대평가: 상위 x% 명수
        val relativeCount = n * x / 100

        // 점수 내림차순 정렬
        scores.sortDescending()

        // 2. 절대평가: y 이상인 점수 개수
        var absoluteCount = 0
        for (score in scores) {
            if (score >= y) {
                absoluteCount++
            }
        }

        // 상대평가 A 인원수: 위에서 정한 명수 그대로
        val relativeResult = relativeCount

        return "$relativeResult $absoluteCount"
    }
}
