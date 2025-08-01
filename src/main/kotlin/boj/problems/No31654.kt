package boj.problems

import java.io.BufferedReader

class No31654 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
        return if (a + b == c) "correct!" else "wrong!"
    }
}
