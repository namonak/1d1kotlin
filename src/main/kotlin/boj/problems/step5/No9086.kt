package boj.problems.step5

import java.io.BufferedReader

object No9086 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val words = Array(n) { input.readLine() }

        return words.joinToString("\n") { word ->
            "${word.first()}${word.last()}"
        }
    }
}
