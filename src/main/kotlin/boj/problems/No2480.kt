package boj.problems

import java.io.BufferedReader

class No2480 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }

        return getPrizeMoney(a, b, c).toString()
    }

    private fun getPrizeMoney(
        a: Int,
        b: Int,
        c: Int
    ): Int {
        if (a == b && b == c) {
            return 10000 + a * 1000
        }
        if (a == b || a == c) {
            return 1000 + a * 100
        }
        return if (b == c) {
            1000 + b * 100
        } else {
            getMaximum(a, b, c) * 100
        }
    }

    private fun getMaximum(
        a: Int,
        b: Int,
        c: Int
    ): Int {
        var max = a
        if (b > max) {
            max = b
        }
        if (c > max) {
            max = c
        }
        return max
    }
}
