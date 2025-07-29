package boj.problems

import java.io.BufferedReader

class No5032 {
    fun solve(input: BufferedReader): String {
        val (e, f, c) = input.readLine().split(" ").map { it.toInt() }
        var total = e + f
        var result = 0
        while (total >= c) {
            val exchange = total / c
            result += exchange
            total = exchange + (total % c)
        }
        return result.toString()
    }
}
