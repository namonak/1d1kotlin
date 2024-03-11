package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No3135 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        val n = input.readLine().toInt()
        val channels = IntArray(n) { input.readLine().toInt() }

        val min = channels.minOf { abs(it - b) }

        return if ((min + 1) < abs(a - b)) {
            (min + 1).toString()
        } else {
            abs(a - b).toString()
        }
    }
}
