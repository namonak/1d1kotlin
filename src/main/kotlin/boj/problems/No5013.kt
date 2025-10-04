package boj.problems

import java.io.BufferedReader

class No5013 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()
        var wins = 0

        repeat(n) {
            val seq = input.readLine().trim()
            if (isWin(seq)) wins++
        }

        return wins.toString()
    }

    private fun isWin(seq: String): Boolean = !seq.contains("CD")
}
