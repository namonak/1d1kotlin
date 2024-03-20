package boj.problems

import java.io.BufferedReader

class No9656 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        return if (n % 2 == 0) "SK" else "CY"
    }
}
