package boj.problems

import java.io.BufferedReader

class No18198 {
    fun solve(input: BufferedReader): String {
        val record = input.readLine()
        var scoreA = 0
        var scoreB = 0

        for (chunk in record.chunked(2)) {
            val player = chunk[0]
            val points = chunk[1].digitToInt()
            if (player == 'A') {
                scoreA += points
            } else {
                scoreB += points
            }
        }

        return if (scoreA > scoreB) "A" else "B"
    }
}
