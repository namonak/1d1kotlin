package boj.problems

import java.io.BufferedReader

class No20254 {
    fun solve(input: BufferedReader): String {
        val (UR, TR, UO, TO) = input.readLine().split(" ").map { it.toInt() }
        val siteScore = 56 * UR + 24 * TR + 14 * UO + 6 * TO
        return siteScore.toString()
    }
}
