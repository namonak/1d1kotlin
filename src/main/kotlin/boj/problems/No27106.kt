package boj.problems

import java.io.BufferedReader

class No27106 {
    fun solve(input: BufferedReader): String {
        val purchase = input.readLine().toInt()
        val change = 100 - purchase

        val coins = intArrayOf(25, 10, 5, 1)
        val result = IntArray(4)

        var remaining = change
        for (i in coins.indices) {
            result[i] = remaining / coins[i]
            remaining %= coins[i]
        }

        return result.joinToString(" ")
    }
}
