package boj.problems

import java.io.BufferedReader

class No32929 {
    fun solve(input: BufferedReader): String {
        val x = input.readLine().toLong()
        return when ((x - 1) % 3) {
            0L -> "U"
            1L -> "O"
            else -> "S"
        }
    }
}
