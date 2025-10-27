package boj.problems

import java.io.BufferedReader

class No2501 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val divisors = getDivisors(n)

        return if (divisors.size >= k) {
            divisors[k - 1]
        } else {
            0
        }.toString()
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
