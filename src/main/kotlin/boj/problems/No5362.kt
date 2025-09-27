package boj.problems

import java.io.BufferedReader

class No5362 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        var line: String?
        while (true) {
            line = input.readLine() ?: break
            sb.append(line.replace("iiing", "th")).append('\n')
        }
        return sb.trimEnd('\n').toString()
    }
}
