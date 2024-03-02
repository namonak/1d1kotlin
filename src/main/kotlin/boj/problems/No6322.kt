package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No6322 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        var i = 1
        while (true) {
            val (a, b, c) = input.readLine().split(" ").map { it.toDouble() }
            if (a == 0.0 && b == 0.0 && c == 0.0) break
            val triangle = Triangle(a, b, c)
            result.append("Triangle #$i\n")
            result.append(triangle.solve())
            result.append("\n")
            i++
        }
        return result.toString().trim()
    }

    class Triangle(private val a: Double, private val b: Double, private val c: Double) {
        fun solve(): String {
            return when {
                a == -1.0 -> {
                    if (c <= b) "Impossible."
                    else "a = ${String.format("%.3f", sqrt(c * c - b * b))}"
                }
                b == -1.0 -> {
                    if (c <= a) "Impossible."
                    else "b = ${String.format("%.3f", sqrt(c * c - a * a))}"
                }
                c == -1.0 -> {
                    "c = ${String.format("%.3f", sqrt(a * a + b * b))}"
                }
                else -> "Impossible."
            } + "\n"
        }
    }
}
