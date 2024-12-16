package boj.problems

import java.io.BufferedReader
import java.math.RoundingMode

class No26575 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val results = mutableListOf<String>()

        repeat(n) {
            val (d, f, p) = input.readLine().split(" ").map { it.toBigDecimal() }
            val totalCost = d * f * p
            val roundedCost = totalCost.setScale(2, RoundingMode.HALF_UP)
            results.add("$$roundedCost")
        }

        return results.joinToString("\n")
    }
}
