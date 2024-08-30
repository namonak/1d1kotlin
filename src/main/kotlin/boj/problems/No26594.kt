package boj.problems

import java.io.BufferedReader

class No26594 {
    fun solve(input: BufferedReader): String {
        val inputString = input.readLine()
        var maxCount = 0
        var currentChar = inputString[0]
        var currentCount = 1

        for (i in 1 until inputString.length) {
            if (inputString[i] == currentChar) {
                currentCount++
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount
                }
                currentChar = inputString[i]
                currentCount = 1
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount
        }

        return maxCount.toString()
    }
}
