package boj.problems

import java.io.BufferedReader

class No11501 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            val n = input.readLine().toInt()
            val prices = input.readLine().split(" ").map { it.toLong() }
            var max = 0L
            var sum = 0L
            for (i in n - 1 downTo 0) {
                if (prices[i] > max) {
                    max = prices[i]
                } else {
                    sum += max - prices[i]
                }
            }
            sb.appendLine(sum)
        }
        return sb.toString().trimEnd()
    }
}
