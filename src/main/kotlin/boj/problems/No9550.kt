package boj.problems

import java.io.BufferedReader

class No9550 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val results = mutableListOf<Int>()

        repeat(t) {
            val (_, k) = input.readLine().split(" ").map { it.toInt() }
            val candies = input.readLine().split(" ").map { it.toInt() }
            val maxKids = candies.sumOf { it / k }

            results.add(maxKids)
        }

        return results.joinToString("\n").trimEnd()
    }
}
