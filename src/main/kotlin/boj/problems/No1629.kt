package boj.problems

import java.io.BufferedReader

class No1629 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toLong() }

        fun modPow(
            base: Long,
            exp: Long
        ): Long {
            if (exp == 0L) return 1L
            if (exp == 1L) return base % c

            val half = modPow(base, exp / 2)
            val result = (half * half) % c
            return if (exp % 2 == 0L) result else (result * base) % c
        }

        return modPow(a, b).toString()
    }
}
