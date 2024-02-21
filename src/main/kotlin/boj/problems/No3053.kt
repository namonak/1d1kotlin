package boj.problems

import java.io.BufferedReader

object No3053 {
    fun solve(input: BufferedReader): String {
        val r = input.readLine().toInt()
        return """
            ${String.format("%.6f", r * r * Math.PI)}
            ${String.format("%.6f", r * r * 2.0)}
        """.trimIndent()
    }
}
