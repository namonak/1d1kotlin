package boj.problems

import java.io.BufferedReader
import kotlin.math.PI
import kotlin.math.sqrt

class No21335 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().trim().toDouble()
        val perimeter = 2 * sqrt(a * PI)
        return "%.6f".format(perimeter)
    }
}
