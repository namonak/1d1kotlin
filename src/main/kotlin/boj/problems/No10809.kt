package boj.problems

import java.io.BufferedReader

private const val ALPHABET_NUMBER = 26

class No10809 {
    fun solve(input: BufferedReader): String {
        val alphabet = IntArray(ALPHABET_NUMBER) { -1 }
        updateAlphabetArray(input.readLine(), alphabet)
        return alphabet.joinToString(separator = " ")
    }

    private fun updateAlphabetArray(
        input: String,
        alphabet: IntArray
    ) {
        for (i in input.indices) {
            checkWordIndex(input, alphabet, i)
        }
    }

    private fun checkWordIndex(
        input: String,
        alphabet: IntArray,
        i: Int
    ) {
        val index = input[i].code - 'a'.code
        if (alphabet[index] == -1) {
            alphabet[index] = i
        }
    }
}
