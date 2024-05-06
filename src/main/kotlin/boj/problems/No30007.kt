package boj.problems

import java.io.BufferedReader

class No30007 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        repeat(n) {
            val (a, b, x) = input.readLine().split(" ").map { it.toInt() }
            val w = a * (x - 1) + b
            result.append("$w\n")
        }
        return result.toString().trimEnd()
    }
}
