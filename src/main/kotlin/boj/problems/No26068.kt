package boj.problems

import java.io.BufferedReader

class No26068 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var result = 0

        repeat(n) {
            val daysUntilExpiration = input.readLine().removePrefix("D-").toInt()
            if (daysUntilExpiration <= 90) {
                result++
            }
        }

        return result.toString()
    }
}
