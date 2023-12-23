package boj.problems

import java.io.BufferedReader

object No10769 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val happyCount = str.windowed(3).count { it == ":-)" }
        val sadCount = str.windowed(3).count { it == ":-(" }

        return when {
            happyCount == 0 && sadCount == 0 -> "none"
            happyCount == sadCount -> "unsure"
            happyCount > sadCount -> "happy"
            else -> "sad"
        }
    }
}
