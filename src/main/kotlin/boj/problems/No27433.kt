package boj.problems

import java.io.BufferedReader

class No27433 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()
        return factorial(n).toString()
    }

    private fun factorial(n: Long): Long {
        return if (n <= 1) 1 else n * factorial(n - 1)
    }
}
