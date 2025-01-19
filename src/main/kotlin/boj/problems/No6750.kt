package boj.problems

import java.io.BufferedReader

class No6750 {
    fun solve(input: BufferedReader): String {
        val validLetters = setOf('I', 'O', 'S', 'H', 'Z', 'X', 'N')
        val word = input.readLine().trim()
        return if (word.all { it in validLetters }) "YES" else "NO"
    }
}
