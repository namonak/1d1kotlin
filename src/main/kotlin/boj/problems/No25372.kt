package boj.problems

import java.io.BufferedReader

fun main() {
    println(No25372.solve(System.`in`.bufferedReader()))
}

object No25372 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()

        repeat(n) {
            val password = input.readLine()
            if (password.length in 6..9) {
                sb.append("yes\n")
            } else {
                sb.append("no\n")
            }
        }

        return sb.toString().trimEnd()
    }
}
