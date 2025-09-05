package boj.problems

import java.io.BufferedReader

class No29863 {
    fun solve(input: BufferedReader): String {
        val sleepTime = input.readLine().toInt()
        val wakeTime = input.readLine().toInt()

        val sleepHours = if (sleepTime in 20..23) {
            (24 - sleepTime) + wakeTime
        } else {
            wakeTime - sleepTime
        }

        return sleepHours.toString()
    }
}
