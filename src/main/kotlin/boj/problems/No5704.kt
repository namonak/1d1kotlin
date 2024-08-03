package boj.problems

import java.io.BufferedReader

class No5704 {
    fun solve(input: BufferedReader): String {
        val alphabetSet = ('a'..'z').toSet()
        val result = StringBuilder()

        while (true) {
            val inputString = input.readLine() ?: break
            if (inputString == "*") break

            val inputSet = inputString.filter { it.isLetter() }.toSet()
            val isPangram = alphabetSet == inputSet

            result.append(if (isPangram) "Y\n" else "N\n")
        }

        return result.toString().trim()
    }
}
