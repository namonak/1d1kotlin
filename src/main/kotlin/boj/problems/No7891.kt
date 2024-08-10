package boj.problems

import java.io.BufferedReader

class No7891 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            val (a, b) = input.readLine().split(" ").map { it.toLong() }
            sb.append(a + b).append("\n")
        }
        return sb.toString().trim()
    }
}
