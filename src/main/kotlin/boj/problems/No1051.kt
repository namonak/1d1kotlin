package boj.problems

import java.io.BufferedReader
import kotlin.math.min

class No1051 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val board = Array(n) { input.readLine().toCharArray() }
        val maxLen = min(n, m) - 1

        for (len in maxLen downTo 0) {
            val side = len + 1
            for (r in 0 until n - len) {
                for (c in 0 until m - len) {
                    val ch = board[r][c]
                    if (ch == board[r][c + len] && ch == board[r + len][c] && ch == board[r + len][c + len]) {
                        return ((side * side).toString())
                    }
                }
            }
        }
        return "1"
    }
}
