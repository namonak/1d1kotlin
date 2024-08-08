package boj.problems

import java.io.BufferedReader

class No30031 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var totalAmount = 0

        repeat(n) {
            val (width, _) = input.readLine().split(" ").map { it.toInt() }
            totalAmount += when (width) {
                136 -> 1000
                142 -> 5000
                148 -> 10000
                154 -> 50000
                else -> 0
            }
        }

        return totalAmount.toString()
    }
}
