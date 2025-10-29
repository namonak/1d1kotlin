package boj.problems

import java.io.BufferedReader

class No16394 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        return (n - FOUNDATION_YEAR).toString()
    }

    private companion object {
        private const val FOUNDATION_YEAR = 1946
    }
}
