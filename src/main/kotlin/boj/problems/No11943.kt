package boj.problems

import java.io.BufferedReader

object No11943 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        val (c, d) = input.readLine().split(" ").map { it.toInt() }

        return if (a + d < b + c) {
            (a + d).toString()
        } else {
            (b + c).toString()
        }
    }
}
