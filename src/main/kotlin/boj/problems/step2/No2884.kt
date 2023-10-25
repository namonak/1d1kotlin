package boj.problems.step2

import java.io.BufferedReader

object No2884 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val time = Time(n, m).minusPresetTime()
        return time.toString()
    }
}

class Time(private val hour: Int, private val minute: Int) {
    fun minusPresetTime(): Time {
        val totalMinute = hour * MINUTES_IN_HOUR + minute
        val minutesToAdd = if (totalMinute < PRESET_TIME) HOURS_IN_DAY * MINUTES_IN_HOUR else 0
        val newTotalMinute = (totalMinute + minutesToAdd - PRESET_TIME) % (HOURS_IN_DAY * MINUTES_IN_HOUR)
        val newHour = newTotalMinute / MINUTES_IN_HOUR
        val newMinute = newTotalMinute % MINUTES_IN_HOUR
        return Time(newHour, newMinute)
    }

    override fun toString(): String {
        return "$hour $minute"
    }

    companion object {
        private const val PRESET_TIME = 45
        private const val HOURS_IN_DAY = 24
        private const val MINUTES_IN_HOUR = 60
    }
}
