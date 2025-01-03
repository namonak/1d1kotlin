package boj.problems

import java.io.BufferedReader

class No4583 {
    private val mirrorMap = mapOf(
        'b' to 'd', 'd' to 'b',
        'p' to 'q', 'q' to 'p',
        'i' to 'i', 'o' to 'o',
        'v' to 'v', 'w' to 'w',
        'x' to 'x'
    )

    fun solve(input: BufferedReader): String {
        val resultBuilder = StringBuilder()

        while (true) {
            val line = input.readLine() ?: break
            if (line == "#") break

            val mirroredWord = mirrorWord(line)
            if (mirroredWord == null) {
                resultBuilder.appendLine("INVALID")
            } else {
                resultBuilder.appendLine(mirroredWord)
            }
        }

        return resultBuilder.toString().trimEnd()
    }

    private fun mirrorWord(word: String): String? {
        val reversed = word.reversed()
        val mirroredBuilder = StringBuilder()
        for (ch in reversed) {
            val mappedChar = mirrorMap[ch] ?: return null
            mirroredBuilder.append(mappedChar)
        }
        return mirroredBuilder.toString()
    }
}
