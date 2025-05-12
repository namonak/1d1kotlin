package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No16600 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().toDouble()
        val perimeter = 4 * sqrt(a)
        return perimeter.toString()
    }
}
