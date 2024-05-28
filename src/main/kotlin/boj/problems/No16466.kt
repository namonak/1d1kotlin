package boj.problems

import java.io.BufferedReader

class No16466 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val tickets = input.readLine().split(" ").map { it.toInt() }.sorted()

        for (i in tickets.indices) {
            if (tickets[i] != i + 1) {
                return (i + 1).toString()
            }
        }

        return (n + 1).toString()
    }
}
