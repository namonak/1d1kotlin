package boj.problems

import java.io.BufferedReader

class No2442 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val builder = StringBuilder()
        for (i in 0 until n) {
            for (j in 0 until n - i - 1) {
                builder.append(" ")
            }
            for (j in 0 until 2 * i + 1) {
                builder.append("*")
            }
            builder.append("\n")
        }
        return builder.toString().trimEnd()
    }
}
