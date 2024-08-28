package boj.problems

import java.io.BufferedReader

class No10102 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val votes = input.readLine()

        val a = votes.count { it == 'A' }
        val b = votes.count { it == 'B' }

        return when {
            a > b -> "A"
            a < b -> "B"
            else -> "Tie"
        }
    }
}
