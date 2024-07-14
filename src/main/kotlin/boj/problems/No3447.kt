package boj.problems

import java.io.BufferedReader

class No3447 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        var line: String?

        while (true) {
            line = input.readLine() ?: break
            while (line?.contains("BUG") == true) {
                line = line.replace("BUG", "")
            }
            sb.append(line).append("\n")
        }

        return sb.toString().trimEnd()
    }
}
