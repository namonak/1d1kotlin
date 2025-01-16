package boj.problems

import java.io.BufferedReader

class No32288 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val s = input.readLine()
        val result = s.map { char ->
            if (char.isUpperCase()) {
                char.lowercaseChar()
            } else {
                char.uppercaseChar()
            }
        }.joinToString("")

        return result
    }
}
