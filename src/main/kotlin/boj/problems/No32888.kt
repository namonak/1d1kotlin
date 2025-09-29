package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No32888 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toDouble() }
        return String.format("%.15f", sqrt(a * a + b * b))
    }
}
