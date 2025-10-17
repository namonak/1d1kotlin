package boj.problems

import java.io.BufferedReader

class No2441 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val builder = StringBuilder()
        for (i in 0 until n) {
            for (j in 0 until i) {
                builder.append(" ")
            }
            for (j in i until n) {
                builder.append("*")
            }
            builder.append("\n")
        }
        return builder.toString().trimEnd()
    }
}
