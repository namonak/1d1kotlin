package boj.problems

import java.io.BufferedReader

class No15740 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toBigInteger() }
        return (a + b).toString()
    }
}
