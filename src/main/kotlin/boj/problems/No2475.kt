package boj.problems

import java.io.BufferedReader

class No2475 {
    fun solve(input: BufferedReader): String {
        val numbers = input.readLine().split(" ").map { it.toInt() }
        return (numbers.sumOf { it * it } % 10).toString()
    }
}
