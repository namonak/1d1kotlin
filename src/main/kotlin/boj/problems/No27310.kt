package boj.problems

import java.io.BufferedReader

class No27310 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val length = s.length
        val colonCount = s.count { it == ':' }
        val underscoreCount = s.count { it == '_' }
        val difficulty = length + colonCount + underscoreCount * 5
        return difficulty.toString()
    }
}
