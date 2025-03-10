package boj.problems

import java.io.BufferedReader

class No25214 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }

        val result = StringBuilder()
        var minValue = numbers[0]
        var maxDiff = 0

        result.append("0")

        for (i in 1 until n) {
            val current = numbers[i]
            minValue = minOf(minValue, current)
            maxDiff = maxOf(maxDiff, current - minValue)
            result.append(" $maxDiff")
        }

        return result.toString()
    }
}
