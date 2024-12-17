package boj.problems

import java.io.BufferedReader

class No24736 {
    fun solve(input: BufferedReader): String {
        fun calculateScore(t: Int, f: Int, s: Int, p: Int, c: Int): Int {
            return t * 6 + f * 3 + s * 2 + p * 1 + c * 2
        }

        val (t1, f1, s1, p1, c1) = input.readLine().split(" ").map { it.toInt() }
        val (t2, f2, s2, p2, c2) = input.readLine().split(" ").map { it.toInt() }

        val visitingScore = calculateScore(t1, f1, s1, p1, c1)
        val homeScore = calculateScore(t2, f2, s2, p2, c2)

        return "$visitingScore $homeScore"
    }
}
