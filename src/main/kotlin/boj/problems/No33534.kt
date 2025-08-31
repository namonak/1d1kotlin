package boj.problems

import java.io.BufferedReader
import kotlin.math.PI
import kotlin.math.ceil
import kotlin.math.sqrt

class No33534 {
    fun solve(input: BufferedReader): String {
        val area = input.readLine().toLong()
        val circumference = 2 * sqrt(area * PI)
        val needed = ceil((circumference - 1e-12) * 10.0) / 10.0
        return String.format("%.1f", needed)
    }
}
