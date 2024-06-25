package boj.problems

import java.io.BufferedReader

class No11508 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val prices = List(n) { input.readLine().toInt() }.sortedDescending()
        var sum = 0
        for (i in prices.indices) {
            if (i % 3 != 2) {
                sum += prices[i]
            }
        }
        return sum.toString()
    }
}
