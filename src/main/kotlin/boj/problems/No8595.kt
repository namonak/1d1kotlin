package boj.problems

import java.io.BufferedReader

class No8595 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val word = input.readLine()

        var sum = 0L
        var currentNumber = ""

        for (char in word) {
            if (char.isDigit()) {
                currentNumber += char
                if (currentNumber.length > 6) {
                    currentNumber = currentNumber.takeLast(6)
                }
            } else {
                if (currentNumber.isNotEmpty()) {
                    sum += currentNumber.toLong()
                    currentNumber = ""
                }
            }
        }

        if (currentNumber.isNotEmpty()) {
            sum += currentNumber.toLong()
        }

        return sum.toString()
    }
}
