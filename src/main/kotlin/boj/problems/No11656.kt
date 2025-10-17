package boj.problems

import java.io.BufferedReader

class No11656 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        return str.indices.map { str.substring(it) }.sorted().joinToString("\n")
    }
}
