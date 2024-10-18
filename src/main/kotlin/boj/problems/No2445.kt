package boj.problems

import java.io.BufferedReader

class No2445 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()

        for (i in 1..n) {
            result.append("*".repeat(i))
            result.append(" ".repeat(2 * (n - i)))
            result.append("*".repeat(i))
            result.append("\n")
        }
        for (i in n - 1 downTo 1) {
            result.append("*".repeat(i))
            result.append(" ".repeat(2 * (n - i)))
            result.append("*".repeat(i))
            result.append("\n")
        }

        return result.toString().trimEnd()
    }
}
