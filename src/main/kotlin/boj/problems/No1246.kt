package boj.problems

import java.io.BufferedReader

class No1246 {
    fun solve(input: BufferedReader): String {
        val (eggCount, customerCount) = input.readLine().split(" ").map { it.toInt() }
        val prices = List(customerCount) { input.readLine().toInt() }.sorted()

        var bestPrice = 0
        var bestRevenue = 0

        for (i in prices.indices) {
            val price = prices[i]
            val willingCustomers = customerCount - i
            val sellCount = minOf(eggCount, willingCustomers)
            val revenue = price * sellCount

            if (revenue > bestRevenue || (revenue == bestRevenue && price < bestPrice)) {
                bestRevenue = revenue
                bestPrice = price
            }
        }

        return "$bestPrice $bestRevenue"
    }
}
