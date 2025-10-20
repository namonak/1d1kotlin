package boj.problems

import java.io.BufferedReader

class No13771 {
    fun solve(input: BufferedReader): String {
        val numberOfPrices = input.readLine().toInt()
        val secondLowestPrice = (1..numberOfPrices)
            .map { input.readLine().toDouble() }
            .sorted()[1]
        return String.format("%.2f", secondLowestPrice)
    }
}
