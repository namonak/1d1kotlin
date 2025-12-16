package boj.problems

import java.io.BufferedReader

class No25870 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine().trim()
        val frequency = countCharacters(word)

        return when {
            isAllEven(frequency) -> EVEN.toString()
            isAllOdd(frequency) -> ODD.toString()
            else -> NEITHER.toString()
        }
    }

    private fun countCharacters(word: String): IntArray {
        val counts = IntArray(ALPHABET_SIZE)
        for (ch in word) {
            counts[ch - 'a']++
        }
        return counts
    }

    private fun isAllEven(counts: IntArray): Boolean = counts.filter { it > 0 }.all { it % 2 == 0 }

    private fun isAllOdd(counts: IntArray): Boolean = counts.filter { it > 0 }.all { it % 2 == 1 }

    companion object {
        private const val ALPHABET_SIZE = 26
        private const val EVEN = 0
        private const val ODD = 1
        private const val NEITHER = 2
    }
}
