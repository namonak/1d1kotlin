package boj.problems

import java.io.BufferedReader

class No5235 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val results = StringBuilder()

        repeat(n) {
            val numbers = input.readLine().trim().split(" ").map { it.toInt() }.drop(1)
            val evenSum = numbers.filter { it % 2 == 0 }.sum()
            val oddSum = numbers.filter { it % 2 != 0 }.sum()

            when {
                evenSum > oddSum -> results.appendLine("EVEN")
                oddSum > evenSum -> results.appendLine("ODD")
                else -> results.appendLine("TIE")
            }
        }

        return results.toString().trimEnd()
    }
}
