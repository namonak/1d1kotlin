package boj.problems

import java.io.BufferedReader

class No34052 {
    fun solve(input: BufferedReader): String {
        val totalTime = List(4) { input.readLine().toInt() }.sum() + 300
        return if (totalTime <= 1800) "Yes" else "No"
    }
}
