package boj.problems.step2

import java.io.BufferedReader

object No1330 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }

        return when {
            a < b -> "<"
            a > b -> ">"
            else -> "=="
        }
    }
}
