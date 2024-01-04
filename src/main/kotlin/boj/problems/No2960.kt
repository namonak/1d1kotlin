package boj.problems

import java.io.BufferedReader

object No2960 {
    fun solve(input: BufferedReader): String {
        val (maxNumber, targetCount) = input.readLine().split(" ").map { it.toInt() }
        val isPrime = BooleanArray(maxNumber + 1) { true }
        var eliminationCount = 0

        for (currentNumber in 2..maxNumber) {
            for (multiple in currentNumber..maxNumber step currentNumber) {
                if (isPrime[multiple]) {
                    isPrime[multiple] = false
                    eliminationCount++
                    if (eliminationCount == targetCount) {
                        return multiple.toString()
                    }
                }
            }
        }

        return ""
    }
}
