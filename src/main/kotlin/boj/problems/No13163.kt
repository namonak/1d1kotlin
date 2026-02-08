package boj.problems

import java.io.BufferedReader

class No13163 {
    fun solve(input: BufferedReader): String {
        val numberOfNicknames = input.readLine().toInt()

        return (1..numberOfNicknames).joinToString("\n") {
            val originalLine = input.readLine()
            convertToGodName(originalLine)
        }
    }

    private fun convertToGodName(originalName: String): String {
        val syllables = originalName.trim().split("\\s+".toRegex())

        return "god" + syllables.drop(1).joinToString("")
    }
}
