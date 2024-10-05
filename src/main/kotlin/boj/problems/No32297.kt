package boj.problems

import java.io.BufferedReader

class No32297 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val s = input.readLine()
        return if (s.contains("gori")) "YES" else "NO"
    }
}
