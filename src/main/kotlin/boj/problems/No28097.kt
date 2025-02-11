package boj.problems

import java.io.BufferedReader

class No28097 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val studyTimes = input.readLine().split(" ").map { it.toInt() }
        val totalStudyTime = studyTimes.sum()
        val totalRestTime = if (n > 1) 8 * (n - 1) else 0
        val totalTime = totalStudyTime + totalRestTime
        val days = totalTime / 24
        val hours = totalTime % 24

        return "$days $hours"
    }
}
