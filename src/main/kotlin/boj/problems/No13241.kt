package boj.problems

import java.io.BufferedReader

class No13241 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split("\\s+".toRegex()).map { it.toLong() }

        return (a * b / gcd(a, b)).toString()
    }

    private fun gcd(
        a: Long,
        b: Long
    ): Long {
        return if (b == 0L) a else gcd(b, a % b)
    }
}
