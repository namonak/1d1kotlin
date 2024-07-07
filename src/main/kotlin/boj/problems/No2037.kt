package boj.problems

import java.io.BufferedReader

class No2037 {
    fun solve(input: BufferedReader): String {
        val (p, w) = input.readLine().split(" ").map { it.toInt() }
        val message = input.readLine()

        val buttonMap = mapOf(
            'A' to Pair(2, 1), 'B' to Pair(2, 2), 'C' to Pair(2, 3),
            'D' to Pair(3, 1), 'E' to Pair(3, 2), 'F' to Pair(3, 3),
            'G' to Pair(4, 1), 'H' to Pair(4, 2), 'I' to Pair(4, 3),
            'J' to Pair(5, 1), 'K' to Pair(5, 2), 'L' to Pair(5, 3),
            'M' to Pair(6, 1), 'N' to Pair(6, 2), 'O' to Pair(6, 3),
            'P' to Pair(7, 1), 'Q' to Pair(7, 2), 'R' to Pair(7, 3), 'S' to Pair(7, 4),
            'T' to Pair(8, 1), 'U' to Pair(8, 2), 'V' to Pair(8, 3),
            'W' to Pair(9, 1), 'X' to Pair(9, 2), 'Y' to Pair(9, 3), 'Z' to Pair(9, 4),
            ' ' to Pair(1, 1)
        )

        var totalTime = 0
        var prevButton: Int? = null

        for (char in message) {
            val (button, presses) = buttonMap[char]!!
            if (prevButton != null && prevButton == button && button != 1) {
                totalTime += w
            }
            totalTime += presses * p
            prevButton = button
        }

        return totalTime.toString()
    }
}
