package boj.problems

import java.io.BufferedReader

class No16485 {
    fun solve(input: BufferedReader): String {
        val (c, b) = input.readLine().split(" ").map { it.toDouble() }
        return (c / b).toString()
    }
}
