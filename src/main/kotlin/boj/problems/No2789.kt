package boj.problems

import java.io.BufferedReader

class No2789 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val banned = "CAMBRIDGE"

        return str.filter { !banned.contains(it) }
    }
}
