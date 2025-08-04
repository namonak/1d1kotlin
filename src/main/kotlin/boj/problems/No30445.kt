package boj.problems

import java.io.BufferedReader

class No30445 {
    fun solve(input: BufferedReader): String {
        val message = input.readLine() ?: ""
        var happyCount = 0
        var sadCount = 0
        val happyLetters = setOf('H', 'A', 'P', 'Y')
        val sadLetters = setOf('S', 'A', 'D')

        for (char in message) {
            if (char in happyLetters) happyCount++
            if (char in sadLetters) sadCount++
        }

        val happinessIndex = if (happyCount + sadCount == 0) {
            0.5
        } else {
            happyCount.toDouble() / (happyCount + sadCount)
        }

        return String.format("%.2f", happinessIndex * 100)
    }
}
