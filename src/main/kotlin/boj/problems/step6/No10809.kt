package boj.problems.step6

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

object No10809 {
    private const val ALPHABET_NUMBER = 26

    fun solve(input: String): String {
        val alphabet = IntArray(ALPHABET_NUMBER) { -1 }
        updateAlphabetArray(input, alphabet)
        return alphabet.joinToString(separator = " ")
    }

    private fun updateAlphabetArray(input: String, alphabet: IntArray) {
        for (i in input.indices) {
            checkWordIndex(input, alphabet, i)
        }
    }

    private fun checkWordIndex(input: String, alphabet: IntArray, i: Int) {
        val index = input[i].code - 'a'.code
        if (alphabet[index] == -1) {
            alphabet[index] = i
        }
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    output.write("${No10809.solve(input.readLine())}\n")

    input.close()
    output.flush()
    output.close()
}
