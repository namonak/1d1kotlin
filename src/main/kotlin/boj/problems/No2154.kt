package boj.problems

import java.io.BufferedReader

object No2154 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine()
        val sequence = (1..number.toInt()).joinToString("")
        val result = sequence.indexOf(number) + 1
        return result.toString()
    }
}
