package boj.problems

import java.io.BufferedReader

object No2443 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        for (i in n downTo 1) {
            for (j in 1 until n - i + 1) {
                sb.append(" ")
            }
            for (j in 1 until i * 2) {
                sb.append("*")
            }
            sb.append("\n")
        }
        return sb.toString().trimEnd()
    }
}
