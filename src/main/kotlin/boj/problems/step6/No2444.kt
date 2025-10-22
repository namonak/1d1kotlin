package boj.problems.step6

import java.io.BufferedReader

class No2444 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()

        for (i in 1..n) {
            for (j in 1..n - i) {
                sb.append(" ")
            }
            for (j in 1 until 2 * i) {
                sb.append("*")
            }
            sb.append("\n")
        }

        for (i in n - 1 downTo 1) {
            for (j in 1..n - i) {
                sb.append(" ")
            }
            for (j in 1 until 2 * i) {
                sb.append("*")
            }
            sb.append("\n")
        }

        return sb.toString().trimEnd()
    }
}
