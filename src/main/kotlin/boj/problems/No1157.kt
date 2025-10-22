package boj.problems

import java.io.BufferedReader

private const val NUMBER_OF_LETTERS = 26

class No1157 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val alphabet = IntArray(NUMBER_OF_LETTERS)
        for (i in str.indices) {
            getAlphabetCount(str, alphabet, i)
        }
        return getResult(alphabet).toString()
    }

    private fun getResult(alphabet: IntArray): Char {
        var maxIdx = -1
        var result = '?'
        for (i in 0 until NUMBER_OF_LETTERS) {
            if (alphabet[i] > maxIdx) {
                maxIdx = alphabet[i]
                result = (i + 'A'.code).toChar()
            } else if (alphabet[i] == maxIdx) {
                result = '?'
            }
        }
        return result
    }

    private fun getAlphabetCount(
        str: String,
        alphabet: IntArray,
        i: Int
    ) {
        if (str[i] in 'a'..'z') {
            alphabet[str[i].code - 'a'.code]++
        } else {
            alphabet[str[i].code - 'A'.code]++
        }
    }
}
