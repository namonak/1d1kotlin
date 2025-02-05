package boj.problems

import java.io.BufferedReader

class No4299 {
    fun solve(input: BufferedReader): String {
        val (sum, diff) = input.readLine().split(" ").map { it.toInt() }

        if (sum < diff) return "-1"
        if ((sum + diff) % 2 != 0 || (sum - diff) % 2 != 0) return "-1"

        val score1 = (sum + diff) / 2
        val score2 = (sum - diff) / 2

        if (score1 < 0 || score2 < 0) return "-1"

        val (high, low) = if (score1 >= score2) score1 to score2 else score2 to score1
        return "$high $low"
    }
}
