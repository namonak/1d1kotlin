package boj.problems

import java.io.BufferedReader

class No10941 {
    fun solve(input: BufferedReader): String {
        return input.readLine().chunked(2).joinToString("") { it.toInt(16).toChar().toString() }
    }
}
