package boj.problems

import java.io.BufferedReader

object No2530 {
    fun solve(input: BufferedReader): String {
        val (hour, minute, second) = input.readLine().split(" ").map { it.toInt() }
        val time = input.readLine().toInt()

        val newSecond = (second + time) % 60
        val newMinute = (minute + (second + time) / 60) % 60
        val newHour = (hour + (minute + (second + time) / 60) / 60) % 24

        return "$newHour $newMinute $newSecond"
    }
}
