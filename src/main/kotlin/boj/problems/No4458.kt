package boj.problems

import java.io.BufferedReader

class No4458 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        repeat(n) {
            val line = input.readLine()
            result.append(line.first().uppercaseChar())
            result.append(line.substring(1))
            result.append("\n")
        }
        return result.toString().trimEnd()
    }
}
