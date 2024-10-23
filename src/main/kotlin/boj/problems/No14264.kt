package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No14264 {
    fun solve(input: BufferedReader): String {
        val l = input.readLine().toLong()

        return (sqrt(3.0) * l * l / 4).toString()
    }
}
