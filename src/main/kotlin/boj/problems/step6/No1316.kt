package boj.problems.step6

import java.io.BufferedReader

private const val ALPHABET_COUNT = 26

class No1316 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var result = 0

        repeat(n) {
            val word = input.readLine()

            if (isGroupWord(word)) {
                result++
            }
        }

        return result.toString()
    }

    private fun isGroupWord(word: String): Boolean {
        val checker = Array(ALPHABET_COUNT) { false }

        for (i in word.indices) {
            val index = word[i] - 'a'

            if (checker[index]) {
                return false
            }
            if (i < word.length - 1 && word[i] != word[i + 1]) {
                checker[index] = true
            }
        }
        return true
    }
}
