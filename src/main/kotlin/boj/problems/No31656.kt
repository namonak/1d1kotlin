package boj.problems

import java.io.BufferedReader

class No31656 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val result = StringBuilder()
        for (i in s.indices) {
            if (i == 0 || s[i] != s[i - 1]) {
                result.append(s[i])
            }
        }
        return result.toString()
    }
}
