package boj.problems

import java.io.BufferedReader

class No10179 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val resultBuilder = StringBuilder()

        repeat(testCaseCount) {
            val originalPrice = input.readLine().toDouble()
            val discountedPrice = originalPrice * 0.8
            resultBuilder.append(String.format("$%.2f", discountedPrice)).appendLine()
        }

        return resultBuilder.toString().trim()
    }
}
