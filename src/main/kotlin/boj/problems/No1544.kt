package boj.problems

import java.io.BufferedReader

class No1544 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine()?.toIntOrNull() ?: return "0"
        val uniqueWords = mutableListOf<String>()

        repeat(n) {
            val currentWord = input.readLine() ?: return@repeat

            if (isNewCycleWord(uniqueWords, currentWord)) {
                uniqueWords.add(currentWord)
            }
        }

        return uniqueWords.size.toString()
    }

    private fun isNewCycleWord(
        existingWords: List<String>,
        target: String
    ): Boolean {
        return existingWords.none { existing -> isCycleEquivalent(existing, target) }
    }

    private fun isCycleEquivalent(
        word1: String,
        word2: String
    ): Boolean {
        if (word1.length != word2.length) return false
        // word1을 두 번 반복하면 발생 가능한 모든 회전 케이스를 포함하게 됩니다.
        val doubleWord = word1 + word1
        return doubleWord.contains(word2)
    }
}
