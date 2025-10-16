package boj.problems

import java.io.BufferedReader

class No15964 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toLong() }
        return (a * a - b * b).toString()
    }
}
