package boj.problems

import java.io.BufferedReader

class No3765 {
    fun solve(input: BufferedReader): String {
        return buildString {
            var line: String?
            while (input.readLine().also { line = it } != null) {
                appendLine(line)
            }
        }.trimEnd()
    }
}
