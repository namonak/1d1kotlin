package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11047.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No11047 {
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
