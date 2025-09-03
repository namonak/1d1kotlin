package boj.problems

import java.io.BufferedReader

class No31306 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine()
        val vowels = setOf('a', 'e', 'i', 'o', 'u')

        val countWithoutY = word.count { it in vowels }
        val countWithY = word.count { it in vowels || it == 'y' }

        return "$countWithoutY $countWithY"
    }
}
