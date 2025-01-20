package boj.problems

import java.io.BufferedReader

class No25814 {
    fun solve(input: BufferedReader): String {
        val (num1, num2) = input.readLine().split(" ")
        val weight1 = weight(num1)
        val weight2 = weight(num2)
        return when {
            weight1 > weight2 -> "1"
            weight1 < weight2 -> "2"
            else -> "0"
        }
    }

    private fun weight(num: String): Int {
        val digitCount = num.length
        val digitSum = num.map { it - '0' }.sum()
        return digitCount * digitSum
    }
}
