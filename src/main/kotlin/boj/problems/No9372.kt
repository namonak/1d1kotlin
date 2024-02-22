package boj.problems

import java.io.BufferedReader

object No9372 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()
        repeat(t) {
            val (n, m) = input.readLine().split(" ").map { it.toInt() }
            repeat(m) {
                val (_, _) = input.readLine().split(" ").map { it.toInt() }
            }
            result.append("${n - 1}\n")
        }
        return result.toString().trimEnd()
    }
}
