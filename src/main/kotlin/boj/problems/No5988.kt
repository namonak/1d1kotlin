package boj.problems

import java.io.BufferedReader

class No5988 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        for (i in 0 until n) {
            val num = input.readLine()
            sb.append(if (num.last().code % 2 == 0) "even" else "odd").append("\n")
        }

        return sb.toString().trimEnd()
    }
}
