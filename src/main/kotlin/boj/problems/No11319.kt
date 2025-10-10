package boj.problems

import java.io.BufferedReader

class No11319 {
    fun solve(input: BufferedReader): String {
        val vowelSet = setOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
        val s = input.readLine().toInt()
        val result = StringBuilder()

        repeat(s) {
            val line = input.readLine()
            var vowelCount = 0
            var consonantCount = 0

            for (char in line) {
                if (!char.isLetter()) continue
                if (char in vowelSet) {
                    vowelCount++
                } else {
                    consonantCount++
                }
            }

            result.append("$consonantCount $vowelCount\n")
        }

        return result.toString().trim()
    }
}
