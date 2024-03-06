package boj.problems

import java.io.BufferedReader

class No9723 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) { idx ->
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }.sorted()
            result.append("Case #${idx + 1}: " + if (a * a + b * b == c * c) "YES\n" else "NO\n")
        }

        return result.toString().trimEnd()
    }
}
