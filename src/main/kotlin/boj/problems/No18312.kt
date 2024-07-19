package boj.problems

import java.io.BufferedReader

class No18312 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        var count = 0
        val kStr = k.toString()
        val maxSeconds = (n + 1) * 60 * 60

        for (totalSeconds in 0 until maxSeconds) {
            val hour = totalSeconds / 3600
            val minute = (totalSeconds % 3600) / 60
            val second = totalSeconds % 60
            val time = "${padTime(hour)}${padTime(minute)}${padTime(second)}"

            if (time.contains(kStr)) {
                count++
            }
        }

        return count.toString()
    }

    private fun padTime(time: Int): String {
        return if (time < 10) "0$time" else time.toString()
    }
}
