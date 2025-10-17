package boj.problems

import java.io.BufferedReader

class No2914 {
    fun solve(input: BufferedReader): String {
        val (a, i) = input.readLine().split(" ").map { it.toInt() }
        return (a * (i - 1) + 1).toString()
    }
}
