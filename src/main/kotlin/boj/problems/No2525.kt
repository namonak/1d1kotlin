package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No2525 {
    companion object {
        private const val ONE_HOUR = 60
        private const val ONE_DAY = 24
    }

    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine())
        var hour = st.nextToken().toInt()
        var minute = st.nextToken().toInt()
        val timeToAdd = input.readLine().toInt()
        minute += timeToAdd
        if (minute >= ONE_HOUR) {
            hour += minute / ONE_HOUR
            minute %= ONE_HOUR
        }
        if (hour >= ONE_DAY) {
            hour %= ONE_DAY
        }
        return "$hour $minute"
    }
}
