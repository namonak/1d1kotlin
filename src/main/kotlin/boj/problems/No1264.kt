package boj.problems

import java.io.BufferedReader

class No1264 {
    fun solve(input: BufferedReader) = buildString {
        while (true) {
            val line = input.readLine()
            if (line == "#") break
            appendLine(line.count { it.lowercaseChar() in "aeiou" })
        }
    }.trimEnd()
}
