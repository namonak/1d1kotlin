package boj.problems.step4

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10810.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10810 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val baskets = IntArray(n + 1)

        for (idx in 0 until m) {
            val (i, j, k) = input.readLine().split(" ").map { it.toInt() }
            for (index in i..j) {
                baskets[index] = k
            }
        }

        return baskets.slice(1..n).joinToString(" ")
    }
}
