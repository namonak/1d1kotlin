package boj.problems

import java.io.BufferedReader

class No20044 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val w = input.readLine().split(" ").map { it.toInt() }.sorted()
        val teams = mutableListOf<Int>()
        for (i in 0 until n) {
            teams.add(w[i] + w[2 * n - i - 1])
        }
        return teams.minOrNull().toString()
    }
}
