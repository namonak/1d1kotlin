package boj.problems

import java.io.BufferedReader

class No11382 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toLong() }
        return (a + b + c).toString()
    }
}
