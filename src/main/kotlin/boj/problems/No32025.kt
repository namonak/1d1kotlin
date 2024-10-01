package boj.problems

import java.io.BufferedReader

class No32025 {
    fun solve(input: BufferedReader): String {
        val h = input.readLine().toInt()
        val w = input.readLine().toInt()
        return (minOf(h, w) * 100 / 2).toString()
    }
}
