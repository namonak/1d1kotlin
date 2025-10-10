package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No4084 {
    fun solve(input: BufferedReader): String {
        val out = StringBuilder()

        while (true) {
            val (a0, b0, c0, d0) = input.readLine().split(" ").map { it.toInt() }
            if (a0 == 0 && b0 == 0 && c0 == 0 && d0 == 0) break

            var a = a0
            var b = b0
            var c = c0
            var d = d0

            var steps = 0
            while (!allEqual(a, b, c, d)) {
                val na = abs(a - b)
                val nb = abs(b - c)
                val nc = abs(c - d)
                val nd = abs(d - a)
                a = na
                b = nb
                c = nc
                d = nd
                steps++
            }
            out.appendLine(steps)
        }

        return out.toString().trimEnd()
    }

    private fun allEqual(
        a: Int,
        b: Int,
        c: Int,
        d: Int
    ): Boolean = a == b && b == c && c == d
}
