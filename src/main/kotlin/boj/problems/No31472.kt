package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No31472 {
    fun solve(input: BufferedReader): String {
        val w = input.readLine().toInt()
        val n = sqrt(2.0 * w).toInt()
        val perimeter = 4 * n

        return perimeter.toString()
    }
}
