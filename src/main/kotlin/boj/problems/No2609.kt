package boj.problems

import java.io.BufferedReader

class No2609 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        val gcd = gcd(a, b)
        val lcm = lcm(a, b, gcd)
        return "$gcd\n$lcm"
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    private fun lcm(
        a: Int,
        b: Int,
        gcd: Int
    ): Int {
        return a * b / gcd
    }
}
