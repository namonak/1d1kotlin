package boj.problems

import java.io.BufferedReader

class No9772 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        input.lineSequence().forEach { it ->
            val (x, y) = it.trim().split(" ").map { it.toDouble() }
            sb.append(
                when {
                    x > 0 && y > 0 -> "Q1"
                    x < 0 && y > 0 -> "Q2"
                    x < 0 && y < 0 -> "Q3"
                    x > 0 && y < 0 -> "Q4"
                    else -> "AXIS"
                }
            ).append("\n")
        }
        return sb.toString().trim()
    }
}
