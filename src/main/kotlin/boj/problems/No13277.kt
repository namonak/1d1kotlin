package boj.problems

import java.io.BufferedReader

object No13277 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toBigInteger() }
        return (a * b).toString()
    }
}
