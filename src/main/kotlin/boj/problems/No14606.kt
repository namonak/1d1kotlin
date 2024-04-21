package boj.problems

import java.io.BufferedReader

class No14606 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        return "${n * (n - 1) / 2}"
    }
}
