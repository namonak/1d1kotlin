package boj.problems

import java.io.BufferedReader
import kotlin.math.min

class No2783 {
    fun solve(input: BufferedReader): String {
        val (x, y) = input.readLine().split(" ").map { it.toInt() }
        var minCostPerGram = x.toDouble() / y

        val n = input.readLine().toInt()
        repeat(n) {
            val (xi, yi) = input.readLine().split(" ").map { it.toInt() }
            val costPerGram = xi.toDouble() / yi
            minCostPerGram = min(minCostPerGram, costPerGram)
        }

        val result = minCostPerGram * 1000
        return String.format("%.2f", result)
    }
}
