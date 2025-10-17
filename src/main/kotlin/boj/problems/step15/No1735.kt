package boj.problems.step15

import java.io.BufferedReader

class No1735 {
    fun solve(input: BufferedReader): String {
        val (a1, b1) = input.readLine().split(" ").map { it.toInt() }
        val (a2, b2) = input.readLine().split(" ").map { it.toInt() }

        val a = a1 * b2 + a2 * b1
        val b = b1 * b2

        return "${a / gcd(a, b)} ${b / gcd(a, b)}"
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
