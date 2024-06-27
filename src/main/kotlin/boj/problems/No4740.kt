package boj.problems

import java.io.BufferedReader

class No4740 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        while (true) {
            val line = input.readLine()
            if (line == "***") break
            result.append(line.reversed()).append("\n")
        }
        return result.toString().trim()
    }
}
