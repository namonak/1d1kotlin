package boj.problems

import java.io.BufferedReader

class No31907 {
    fun solve(input: BufferedReader): String {
        val k = input.readLine().toInt()

        val baseImage = listOf(
            "G...",
            ".I.T",
            "..S."
        )

        val result = StringBuilder()

        for (line in baseImage) {
            repeat(k) {
                for (char in line) {
                    repeat(k) {
                        result.append(char)
                    }
                }
                result.appendLine()
            }
        }

        return result.toString()
    }
}
