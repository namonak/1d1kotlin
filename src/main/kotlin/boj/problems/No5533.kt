package boj.problems

import java.io.BufferedReader

class No5533 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val picks = Array(n) {
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
            intArrayOf(a, b, c)
        }
        val freq = Array(3) { IntArray(101) }

        for (i in 0 until n) {
            for (round in 0 until 3) {
                freq[round][picks[i][round]]++
            }
        }

        val sb = StringBuilder()
        for (i in 0 until n) {
            var score = 0
            for (round in 0 until 3) {
                val value = picks[i][round]
                if (freq[round][value] == 1) {
                    score += value
                }
            }
            sb.appendLine(score)
        }

        return sb.toString().trimEnd()
    }
}
