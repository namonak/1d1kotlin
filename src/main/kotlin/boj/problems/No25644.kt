package boj.problems

import java.io.BufferedReader

class No25644 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val prices = input.readLine().split(" ").map { it.toInt() }

        var minPrice = prices[0]
        var maxProfit = 0

        for (i in 1 until n) {
            val price = prices[i]
            maxProfit = maxOf(maxProfit, price - minPrice)
            minPrice = minOf(minPrice, price)
        }

        return maxProfit.toString()
    }
}
