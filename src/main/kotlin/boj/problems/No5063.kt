package boj.problems

import java.io.BufferedReader

class No5063 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val results = StringBuilder()

        repeat(n) {
            val (r, e, c) = input.readLine().split(" ").map { it.toInt() }
            when {
                r + c > e -> results.appendLine("do not advertise")
                r + c < e -> results.appendLine("advertise")
                else -> results.appendLine("does not matter")
            }
        }

        return results.toString().trimEnd()
    }
}
