package boj.problems

import java.io.BufferedReader

class No26082 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
        val warboyPerformance = (b * c * 3) / a
        return warboyPerformance.toString()
    }
}
