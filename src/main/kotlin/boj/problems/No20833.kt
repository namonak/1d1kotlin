package boj.problems

import java.io.BufferedReader

class No20833 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sum = n * (n + 1) / 2
        return "${sum * sum}"
    }
}
