package boj.problems

import java.io.BufferedReader

class No13305 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val distances = input.readLine().split(" ").map { it.toLong() }
        val prices = input.readLine().split(" ").map { it.toLong() }
        var lowPrice = prices[0]
        var result = 0L

        for (i in 0 until n - 1) {
            if (prices[i] < lowPrice) {
                lowPrice = prices[i]
            }
            result += distances[i] * lowPrice
        }
        return result.toString()
    }
}
