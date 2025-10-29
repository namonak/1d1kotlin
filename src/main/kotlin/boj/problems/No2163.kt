package boj.problems

import java.io.BufferedReader

class No2163 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }

        return (n * m - 1).toString()
    }
}
