package boj.problems.step4

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10813.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10813 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val baskets = IntArray(n + 1) { it }

        for (idx in 0 until m) {
            val (i, j) = input.readLine().split(" ").map { it.toInt() }
            val temp = baskets[i]
            baskets[i] = baskets[j]
            baskets[j] = temp
        }

        return baskets.slice(1..n).joinToString(" ")
    }
}
