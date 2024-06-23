package boj.problems

import java.io.BufferedReader

class No14489 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        val c = input.readLine().toInt()
        return if (a + b >= c * 2) {
            (a + b - c * 2).toString()
        } else {
            (a + b).toString()
        }
    }
}
