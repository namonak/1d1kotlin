package boj.problems

import java.io.BufferedReader

class No33990 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var minDiff = Int.MAX_VALUE
        var bestSum = -1

        repeat(n) {
            val (bench, squat, deadlift) = input.readLine().split(' ').map(String::toInt)
            val total = bench + squat + deadlift
            if (total >= 512) {
                val diff = total - 512
                if (diff < minDiff) {
                    minDiff = diff
                    bestSum = total
                }
            }
        }

        return bestSum.toString()
    }
}
