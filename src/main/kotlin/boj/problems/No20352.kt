package boj.problems

import java.io.BufferedReader
import kotlin.math.PI
import kotlin.math.sqrt

class No20352 {
    fun solve(input: BufferedReader): String {
        val area = input.readLine().toLong()
        val radius = sqrt(area.toDouble() / PI)
        val circumference = 2 * PI * radius
        return "%.6f".format(circumference)
    }
}
