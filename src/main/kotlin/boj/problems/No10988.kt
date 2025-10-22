package boj.problems

import java.io.BufferedReader

class No10988 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine()
        return if (word == word.reversed()) "1" else "0"
    }
}
