package boj.problems

import java.io.BufferedReader

class No2953 {
    fun solve(input: BufferedReader): String {
        val scores = List(5) { input.readLine().split(" ").map { it.toInt() } }
        val maxScore = scores.maxOf { it.sum() }
        val winner = scores.indexOfFirst { it.sum() == maxScore } + 1
        return "$winner $maxScore"
    }
}
