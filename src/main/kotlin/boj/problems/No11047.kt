package boj.problems

import java.io.BufferedReader

class No11047 {
    fun solve(input: BufferedReader): Int {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val coins = mutableListOf<Int>()
        var result = 0

        repeat(n) {
            coins.add(input.readLine().toInt())
        }
        coins.sortDescending()

        var remain = k
        for (coin in coins) {
            if (remain == 0) break
            if (remain < coin) continue
            result += remain / coin
            remain %= coin
        }

        return result
    }
}
