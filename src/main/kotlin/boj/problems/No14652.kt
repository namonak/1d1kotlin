package boj.problems

import java.io.BufferedReader

class No14652 {
    fun solve(input: BufferedReader): String {
        val (_, m, k) = input.readLine().split(" ").map { it.toInt() }
        return "${k / m} ${k % m}"
    }
}
