package boj.problems

import java.io.BufferedReader

class No32651 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toLong()
        return if (isRemembered(n)) "Yes" else "No"
    }

    private fun isRemembered(n: Long): Boolean {
        val LIMIT = 100_000L
        val BASE = 2024L
        return n <= LIMIT && n % BASE == 0L
    }
}
