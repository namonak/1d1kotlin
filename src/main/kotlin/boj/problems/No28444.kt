package boj.problems

import java.io.BufferedReader

class No28444 {
    fun solve(input: BufferedReader): String {
        val (h, i, a, r, c) = input.readLine().split(" ").map { it.toInt() }
        return (h * i - a * r * c).toString()
    }
}
