package boj.problems

import java.io.BufferedReader

class No25915 {
    fun solve(input: BufferedReader): String {
        val startChar = input.readLine().trim()[0]
        val result = kotlin.math.abs(startChar.code - 'I'.code)
        return (result + 84).toString()
    }
}
