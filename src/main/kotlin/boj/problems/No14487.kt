package boj.problems

import java.io.BufferedReader

class No14487 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val costs = input.readLine().split(" ").map { it.toInt() }.sorted().dropLast(1)

        return costs.sum().toString()
    }
}
