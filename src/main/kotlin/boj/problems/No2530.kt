package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2530.solve(input))

    input.close()
    output.close()
}

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
