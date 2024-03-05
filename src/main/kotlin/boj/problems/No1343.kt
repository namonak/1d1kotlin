package boj.problems

import java.io.BufferedReader

class No1343 {
    fun solve(input: BufferedReader): String {
        val board = input.readLine()
        val result = board.replace("XXXX", "AAAA").replace("XX", "BB")
        return if (result.contains("X")) "-1" else result
    }
}
