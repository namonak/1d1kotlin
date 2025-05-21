package boj.problems

import java.io.BufferedReader
import kotlin.math.PI
import kotlin.math.sqrt

class No26173 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().toLong()
        val diameter = 2 * sqrt(a / PI)
        return String.format("%.10f", diameter)
    }
}
