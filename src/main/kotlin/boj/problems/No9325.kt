package boj.problems

import java.io.BufferedReader

class No9325 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()
        repeat(t) {
            var s = input.readLine().toInt()
            val n = input.readLine().toInt()
            repeat(n) {
                val (q, p) = input.readLine().split(" ").map { it.toInt() }
                s += q * p
            }
            result.append("$s\n")
        }
        return result.toString().trim()
    }
}
