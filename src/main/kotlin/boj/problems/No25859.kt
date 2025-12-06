package boj.problems

import java.io.BufferedReader

class No25859 {
    fun solve(input: BufferedReader): String {
        val text = input.readLine()

        val frequency = buildFrequencyMap(text)
        val sortedChars = sortByFrequencyAndAlphabet(frequency)

        return buildString(text.length) {
            sortedChars.forEach { (char, count) ->
                repeat(count) { append(char) }
            }
        }
    }

    private fun buildFrequencyMap(text: String): Map<Char, Int> = text.groupingBy { it }.eachCount()

    private fun sortByFrequencyAndAlphabet(freq: Map<Char, Int>): List<Pair<Char, Int>> =
        freq.toList()
            .sortedWith(
                compareByDescending<Pair<Char, Int>> { it.second } // frequency
                    .thenBy { it.first } // alphabet
            )
}
