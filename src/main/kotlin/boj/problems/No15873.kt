package boj.problems

import java.io.BufferedReader

class No15873 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        val result = when {
            n < 100 -> n / 10 + n % 10
            n % 10 == 0 -> 10 + n / 100
            else -> n / 10 + n % 100
        }

        return result.toString()
    }
}
