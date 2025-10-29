package boj.problems

import java.io.BufferedReader

class No2864 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().trim().split(Regex("\\s+"), limit = 2)
        val minSum = a.asMinVariant() + b.asMinVariant()
        val maxSum = a.asMaxVariant() + b.asMaxVariant()
        return "$minSum $maxSum"
    }

    private fun String.asMinVariant(): Int = replace('6', '5').toInt()

    private fun String.asMaxVariant(): Int = replace('5', '6').toInt()
}
