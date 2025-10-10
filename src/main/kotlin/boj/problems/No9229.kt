package boj.problems

import java.io.BufferedReader

class No9229 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val testCase = mutableListOf<String>()
            while (true) {
                val line = input.readLine()?.trim() ?: "#"
                if (line == "#") {
                    if (testCase.isNotEmpty()) {
                        result.append(if (isWordLadder(testCase)) "Correct" else "Incorrect").append('\n')
                    }
                    break
                }
                testCase.add(line)
            }

            if (testCase.isEmpty()) break
        }

        return result.toString().trim()
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
