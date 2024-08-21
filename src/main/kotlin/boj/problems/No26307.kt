package boj.problems

import java.io.BufferedReader

class No26307 {
    fun solve(input: BufferedReader): String {
        val (HH, MM) = input.readLine().split(" ").map { it.toInt() }
        val elapsedTime = (HH - 9) * 60 + MM
        return elapsedTime.toString()
    }
}
