package boj.problems

import java.io.BufferedReader

class No11816 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine()
        return when {
            number.startsWith("0x") -> number.substring(2).toInt(16).toString()
            number.startsWith("0") -> number.substring(1).toInt(8).toString()
            else -> number
        }
    }
}
