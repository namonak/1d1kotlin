package boj.problems

import java.io.BufferedReader

class No14471 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val needToConvert = mutableListOf<Int>()
        var winCount = 0

        repeat(m) {
            val (a, _) = input.readLine().split(" ").map { it.toInt() }
            if (a >= n) {
                winCount++
            } else {
                needToConvert += (n - a)
            }
        }

        if (winCount >= m - 1) return "0"

        val additionalNeeded = m - 1 - winCount
        needToConvert.sort()
        val minCost = needToConvert.take(additionalNeeded).sum()

        return minCost.toString()
    }
}
