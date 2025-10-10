package boj.problems

import java.io.BufferedReader

class No10173 {
    fun solve(input: BufferedReader) =
        with(StringBuilder()) {
            while (true) {
                val line = input.readLine()
                if (line == "EOI") break
                append(if (line.contains("nemo", ignoreCase = true)) "Found" else "Missing").append('\n')
            }
            toString().trim()
        }
}
