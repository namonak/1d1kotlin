package boj.problems

import java.io.BufferedReader
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

class No11337 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) {
            val (r, b) = input.readLine().trim().split(" ").map { it.toDouble() }

            val sqrt2R = sqrt(2.0) * r
            val s = min(b, sqrt2R) // 짧은 변 최적값
            val radicand = max(0.0, 4 * r * r - s * s)
            val area = s * sqrt(radicand) // 넓이

            out.appendLine(String.format("%.3f", area))
        }

        return out.toString().trimEnd()
    }
}
