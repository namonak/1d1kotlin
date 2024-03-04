package boj.problems

import java.io.BufferedReader

class No14215 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }.sorted()
        return if (a + b > c) {
            (a + b + c).toString()
        } else {
            ((a + b) * 2 - 1).toString()
        }
    }
}
