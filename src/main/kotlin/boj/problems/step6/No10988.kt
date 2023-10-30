package boj.problems.step6

import java.io.BufferedReader

object No10988 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine()
        return if (word == word.reversed()) "1" else "0"
    }
}
