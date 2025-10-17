package boj.problems

import java.io.BufferedReader

class No9085 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            input.readLine().toInt()
            val numbers = input.readLine().split(" ").map { it.toInt() }
            sb.append("${numbers.sum()}\n")
        }
        return sb.toString().trimEnd()
    }
}
