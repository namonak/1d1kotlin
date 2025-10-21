package boj.problems

import java.io.BufferedReader

class No10810 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val baskets = IntArray(n + 1)

        repeat(m) {
            val (i, j, k) = input.readLine().split(" ").map { it.toInt() }
            for (index in i..j) {
                baskets[index] = k
            }
        }

        return baskets.slice(1..n).joinToString(" ")
    }
}
