package boj.problems.step4

import java.io.BufferedReader

object No10811 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val baskets = MutableList(n) { it + 1 }

        for (idx in 0 until m) {
            val (i, j) = input.readLine().split(" ").map { it.toInt() }
            baskets.subList(i - 1, j).reverse()
        }

        return baskets.joinToString(" ")
    }
}
