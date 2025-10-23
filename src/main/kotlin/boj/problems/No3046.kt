package boj.problems

import java.io.BufferedReader

class No3046 {
    fun solve(input: BufferedReader): String {
        val (r1, s) = input.readLine().split(" ").map { it.toInt() }

        return (s * 2 - r1).toString()
    }
}
