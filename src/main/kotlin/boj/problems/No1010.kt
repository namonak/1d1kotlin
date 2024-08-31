package boj.problems

import java.io.BufferedReader

class No1010 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()
        repeat(t) {
            val (n, m) = input.readLine().split(" ").map { it.toInt() }
            result.append("${combination(m, n)}\n")
        }
        return result.toString().trim()
    }

    private fun combination(m: Int, n: Int): Int {
        var result = 1
        for (i in 1..n) {
            result = result * (m - n + i) / i
        }
        return result
    }
}
