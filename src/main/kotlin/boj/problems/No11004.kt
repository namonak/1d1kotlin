package boj.problems

import java.io.BufferedReader

class No11004 {
    fun solve(input: BufferedReader): String {
        val (_, k) = input.readLine().split(" ").map { it.toInt() }
        val numbers = input.readLine().split(" ").map { it.toInt() }.sorted()

        return (numbers[k - 1]).toString()
    }
}
