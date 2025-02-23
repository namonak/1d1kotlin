package boj.problems

import java.io.BufferedReader

class No6064 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        val testCases = input.readLine().toInt()

        repeat(testCases) {
            val (m, n, x, y) = input.readLine().split(" ").map { it.toInt() }
            val lastYear = lcm(m, n)

            var year = x
            var found = false

            while (year <= lastYear) {
                if ((year - 1) % n + 1 == y) {
                    sb.appendLine(year)
                    found = true
                    break
                }
                year += m
            }

            if (!found) sb.appendLine(-1)
        }
        return sb.toString().trimEnd()
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    private fun lcm(a: Int, b: Int): Int {
        return a / gcd(a, b) * b
    }
}
