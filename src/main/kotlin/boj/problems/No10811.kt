package boj.problems

import java.io.BufferedReader

class No10811 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val baskets = MutableList(n) { it + 1 }

        repeat(m) {
            val (i, j) = input.readLine().split(" ").map { it.toInt() }
            baskets.subList(i - 1, j).reverse()
        }

        return baskets.joinToString(" ")
    }
}
