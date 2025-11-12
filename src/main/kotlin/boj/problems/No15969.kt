package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No15969 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val st = StringTokenizer(input.readLine())
        var minScore = Int.MAX_VALUE
        var maxScore = Int.MIN_VALUE

        repeat(n) {
            val score = st.nextToken().toInt()
            if (score < minScore) minScore = score
            if (score > maxScore) maxScore = score
        }

        return (maxScore - minScore).toString()
    }
}
