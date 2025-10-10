package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No5618 {
    fun solve(input: BufferedReader): String {
        // 'n' is not used
        input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val gcd = findGCD(numbers)
        val divisors = getDivisors(gcd)

        return divisors.joinToString("\n")
    }

    private fun findGCD(numbers: List<Int>): Int {
        return numbers.reduce { acc, num -> gcd(acc, num) }
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    private fun getDivisors(gcd: Int): List<Int> {
        val divisors = mutableListOf<Int>()

        for (i in 1..sqrt(gcd.toDouble()).toInt()) {
            if (gcd % i == 0) {
                divisors.add(i)
                if (i != gcd / i) {
                    divisors.add(gcd / i)
                }
            }
        }
        return divisors.sorted()
    }
}
