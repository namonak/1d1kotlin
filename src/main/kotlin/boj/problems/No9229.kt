package boj.problems

import java.io.BufferedReader

class No9229 {
    fun solve(input: BufferedReader): String {
        val results = mutableListOf<String>()

        while (true) {
            val testCase = readTestCase(input)
            if (testCase.isEmpty()) break

            results.add(if (isWordLadder(testCase)) "Correct" else "Incorrect")
        }

        return results.joinToString("\n")
    }

    private fun readTestCase(input: BufferedReader): List<String> {
        val words = mutableListOf<String>()

        while (true) {
            val line = input.readLine()?.trim() ?: return words
            if (line == "#") return words

            words.add(line)
        }
    }

    private fun isWordLadder(words: List<String>): Boolean {
        for (i in 0 until words.size - 1) {
            if (!isSingleChange(words[i], words[i + 1])) {
                return false
            }
        }
        return true
    }

    private fun isSingleChange(
        word1: String,
        word2: String
    ): Boolean {
        if (word1.length != word2.length) return false

        var diffCount = 0
        for (i in word1.indices) {
            if (word1[i] != word2[i]) {
                diffCount++
                if (diffCount > 1) return false
            }
        }

        return diffCount == 1
    }
}
