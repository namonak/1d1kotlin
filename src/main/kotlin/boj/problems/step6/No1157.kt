package boj.problems.step6

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

object No1157 {
    private const val NUMBER_OF_LETTERS = 26

    @Throws(IOException::class)
    fun solve(input: BufferedReader): Char {
        val str = input.readLine()
        val alphabet = IntArray(NUMBER_OF_LETTERS)
        for (i in str.indices) {
            getAlphabetCount(str, alphabet, i)
        }
        return getResult(alphabet)
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

    private fun getAlphabetCount(str: String, alphabet: IntArray, i: Int) {
        if (str[i] in 'a'..'z') {
            alphabet[str[i].code - 'a'.code]++
        } else {
            alphabet[str[i].code - 'A'.code]++
        }
    }
}

fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    output.write(No1157.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}
