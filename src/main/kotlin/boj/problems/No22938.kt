package boj.problems

import java.io.BufferedReader
import kotlin.math.pow
import kotlin.math.sqrt

class No22938 {
    fun solve(input: BufferedReader): String {
        val (x1, y1, r1) = input.readLine().split(" ").map { it.toLong() }
        val (x2, y2, r2) = input.readLine().split(" ").map { it.toLong() }
        val distance = sqrt((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2))
        return if (distance >= r1 + r2) "NO" else "YES"
    }
}
