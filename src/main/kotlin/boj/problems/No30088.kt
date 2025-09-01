package boj.problems

import java.io.BufferedReader

class No30088 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val times = LongArray(n)

        repeat(n) { i ->
            val departmentTimes = input.readLine().split(" ").map { it.toLong() }
            times[i] = departmentTimes.drop(1).sum()
        }

        times.sort()

        var totalWaitTime = 0L
        var currentCumulativeTime = 0L

        // 4. 정렬된 시간을 바탕으로 누적합을 계산합니다.
        for (time in times) {
            currentCumulativeTime += time
            totalWaitTime += currentCumulativeTime
        }

        return totalWaitTime.toString()
    }
}
