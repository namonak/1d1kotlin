package boj.problems

import java.io.BufferedReader

class No1330 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }

        return when {
            a < b -> "<"
            a > b -> ">"
            else -> "=="
        }
    }
}
