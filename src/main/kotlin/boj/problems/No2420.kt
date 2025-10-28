package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No2420 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toLong() }

        return abs(n - m).toString()
    }
}
