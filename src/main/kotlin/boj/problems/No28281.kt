package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No28281 {
    fun solve(input: BufferedReader): String {
        val firstLine = StringTokenizer(input.readLine())
        if (!firstLine.hasMoreTokens()) return ""

        val days = firstLine.nextToken().toInt()
        val socksPerDay = firstLine.nextToken().toLong()

        val priceTokens = StringTokenizer(input.readLine())
        val prices = IntArray(days) { priceTokens.nextToken().toInt() }
        var minTotalCost = Long.MAX_VALUE

        for (i in 0 until days - 1) {
            val twoDaysPriceSum = prices[i] + prices[i + 1]
            val currentTotalCost = twoDaysPriceSum * socksPerDay

            if (currentTotalCost < minTotalCost) {
                minTotalCost = currentTotalCost
            }
        }

        return minTotalCost.toString()
    }
}
