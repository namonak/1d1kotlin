package boj.problems.step9

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2501.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2501 {
    fun solve(input: BufferedReader): Int {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val divisors = getDivisors(n)

        return if (divisors.size >= k) {
            divisors[k - 1]
        } else {
            0
        }
    }

    private fun getDivisors(number: Int): List<Int> {
        val divisors = mutableListOf<Int>()

        for (i in 1..number) {
            if (number % i == 0) {
                divisors.add(i)
            }
        }

        return divisors
    }
}
