package boj.problems

import java.io.BufferedReader

class No25801 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine().trim()
        val frequency = countCharacters(word)

        val isEven = frequency.values.all { it % 2 == 0 }
        val isOdd = frequency.values.all { it % 2 == 1 }

        return when {
            isEven -> "0"
            isOdd -> "1"
            else -> "0/1"
        }
    }

    private fun countCharacters(word: String): Map<Char, Int> = word.groupingBy { it }.eachCount()
}
