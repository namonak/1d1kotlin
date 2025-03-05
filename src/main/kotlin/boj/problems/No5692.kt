package boj.problems

import java.io.BufferedReader

class No5692 {
    fun solve(input: BufferedReader): String {
        val results = mutableListOf<Int>()

        while (true) {
            val line = input.readLine().trim()
            if (line == "0") break

            var decimalValue = 0
            val length = line.length

            for ((index, char) in line.withIndex()) {
                val digit = char - '0'
                decimalValue += digit * factorial(length - index)
            }

            results.add(decimalValue)
        }

        return results.joinToString("\n")
    }

    private fun factorial(n: Int): Int {
        return if (n <= 1) 1 else n * factorial(n - 1)
    }
}
