package boj.problems.step6

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1316.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

private const val ALPHABET_COUNT = 26

object No1316 {
    fun solve(input: BufferedReader): Int {
        val n = input.readLine().toInt()
        var result = 0

        repeat(n) {
            val word = input.readLine()

            if (isGroupWord(word)) {
                result++
            }
        }

        return result
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
