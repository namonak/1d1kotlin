package boj.problems

import java.io.BufferedReader

class No20673 {
    fun solve(input: BufferedReader): String {
        val p = input.readLine().toInt()
        val q = input.readLine().toInt()

        return when {
            p <= 50 && q <= 10 -> "White"
            q > 30 -> "Red"
            else -> "Yellow"
        }
    }
}
