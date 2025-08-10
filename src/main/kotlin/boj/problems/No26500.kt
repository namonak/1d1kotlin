package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No26500 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val (a, b) = input.readLine().split(" ").map { it.toDouble() }
            val distance = abs(a - b)
            result.appendLine(String.format("%.1f", distance))
        }

        return result.toString().trimEnd()
    }
}
