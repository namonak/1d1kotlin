package boj.problems

import java.io.BufferedReader

class No9295 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val results = StringBuilder()

        repeat(n) { case ->
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            results.appendLine("Case ${case + 1}: ${a + b}")
        }

        return results.toString().trim()
    }
}
