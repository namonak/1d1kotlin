package boj.problems

import java.io.BufferedReader

class No5565 {
    fun solve(input: BufferedReader): String {
        val total = input.readLine().toInt()
        return (1..9).sumOf { input.readLine().toInt() }.let { total - it }.toString()
    }
}
