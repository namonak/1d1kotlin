package boj.problems

import java.io.BufferedReader

class No2845 {
    fun solve(input: BufferedReader): String {
        val (l, p) = input.readLine().split(" ").map { it.toInt() }
        val news = input.readLine().split(" ").map { it.toInt() }

        return news.map { it - l * p }.joinToString(" ")
    }
}
