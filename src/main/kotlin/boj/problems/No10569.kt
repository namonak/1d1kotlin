package boj.problems

import java.io.BufferedReader

class No10569 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()
        repeat(t) {
            val (v, e) = input.readLine().split(" ").map { it.toInt() }
            result.append("${2 - v + e}\n")
        }
        return result.toString().trimEnd()
    }
}
