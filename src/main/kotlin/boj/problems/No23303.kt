package boj.problems

import java.io.BufferedReader

class No23303 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        return if (str.contains("d2", ignoreCase = true)) "D2" else "unrated"
    }
}
