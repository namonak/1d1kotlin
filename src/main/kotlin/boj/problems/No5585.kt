package boj.problems

import java.io.BufferedReader

class No5585 {
    fun solve(input: BufferedReader): String {
        val paid = input.readLine().toInt()
        var change = 1000 - paid
        val coins = listOf(500, 100, 50, 10, 5, 1)
        var result = 0

        for (coin in coins) {
            if (change == 0) break
            if (change < coin) continue
            result += change / coin
            change %= coin
        }

        return result.toString()
    }
}
