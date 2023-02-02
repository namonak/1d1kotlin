package boj.problems.step6

import java.io.*

object No10809 {
    private const val ALPHABET_NUMBER = 26
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val input = BufferedReader(InputStreamReader(System.`in`))
        val output = BufferedWriter(OutputStreamWriter(System.out))
        output.write(solve(input))
        input.close()
        output.flush()
        output.close()
    }

    fun solve(input: BufferedReader): String {
        val word = checkInput(input)
        val alphabet = initAlphabetArray()
        updateAlphabetArray(word, alphabet)
        return makeResult(alphabet)
    }

    private fun makeResult(alphabet: IntArray): String {
        val sb = StringBuilder()
        for (i in alphabet.indices) {
            sb.append(alphabet[i]).append(" ")
        }
        sb.setLength(sb.length - 1)
        return sb.toString()
    }

    private fun updateAlphabetArray(word: String?, alphabet: IntArray) {
        for (i in 0 until word!!.length) {
            checkWordIndex(word, alphabet, i)
        }
    }

    private fun checkWordIndex(word: String?, alphabet: IntArray, i: Int) {
        val index = word!![i].code - 'a'.code
        if (alphabet[index] == -1) {
            alphabet[index] = i
        }
    }

    private fun initAlphabetArray(): IntArray {
        val alphabet = IntArray(ALPHABET_NUMBER)
        for (i in alphabet.indices) {
            alphabet[i] = -1
        }
        return alphabet
    }

    private fun checkInput(input: BufferedReader): String? {
        var word: String? = null
        try {
            word = input.readLine()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return word
    }
}
