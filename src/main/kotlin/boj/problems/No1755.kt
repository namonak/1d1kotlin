package boj.problems

import java.io.BufferedReader

class No1755 {
    fun solve(input: BufferedReader): String {
        val numberToWord = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        val (m, n) = input.readLine().split(" ").map { it.toInt() }

        val numbers = (m..n).sortedWith(
            compareBy { num ->
                val tens = num / 10
                val ones = num % 10

                if (tens == 0) {
                    return@compareBy numberToWord[ones]
                }

                "${numberToWord[tens]} ${numberToWord[ones]}"
            }
        )

        val result = StringBuilder()
        for (i in numbers.indices) {
            result.append(numbers[i])
            if (i % 10 == 9) {
                result.append("\n")
            } else {
                result.append(" ")
            }
        }

        return result.toString().trim()
    }
}
