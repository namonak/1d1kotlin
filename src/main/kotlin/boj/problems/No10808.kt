package boj.problems

import java.io.BufferedReader

class No10808 {
    fun solve(input: BufferedReader): String {
        val alphabetCount = IntArray(ALPHABET_SIZE)
        input.readLine().forEach { alphabetCount[it - 'a']++ }
        return alphabetCount.joinToString(" ")
    }

    companion object {
        private const val ALPHABET_SIZE = 26
    }
}
