package boj.problems

import java.io.BufferedReader

class No14405 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val regex = Regex("^(pi|ka|chu)*$")
        return if (regex.matches(s)) "YES" else "NO"
    }
}
