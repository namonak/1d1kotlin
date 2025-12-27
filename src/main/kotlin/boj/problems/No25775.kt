package boj.problems

import java.io.BufferedReader

class No25775 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val words = List(n) { input.readLine().trim() }

        val maxLength = words.maxOf { it.length }
        val result = StringBuilder()

        for (position in 0 until maxLength) {
            val frequencyMap = countLettersAtPosition(words, position)
            val mostFrequentLetters = mostFrequentLetters(frequencyMap)

            result.append(position + 1)
                .append(": ")
                .append(mostFrequentLetters.joinToString(" "))
                .append('\n')
        }

        return result.toString().trimEnd()
    }

    private fun countLettersAtPosition(
        words: List<String>,
        position: Int
    ): Map<Char, Int> {
        val frequencyMap = mutableMapOf<Char, Int>()

        for (word in words) {
            if (position < word.length) {
                val letter = word[position]
                frequencyMap[letter] = frequencyMap.getOrDefault(letter, 0) + 1
            }
        }

        return frequencyMap
    }

    private fun mostFrequentLetters(frequencyMap: Map<Char, Int>): List<Char> {
        val maxFrequency = frequencyMap.values.maxOrNull() ?: 0

        return frequencyMap
            .filterValues { it == maxFrequency }
            .keys
            .sorted()
    }
}
