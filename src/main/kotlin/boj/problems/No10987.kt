package boj.problems

import java.io.BufferedReader

class No10987 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        return str.count { it in "aeiou" }.toString()
    }
}
