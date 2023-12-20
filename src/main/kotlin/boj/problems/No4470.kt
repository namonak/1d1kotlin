package boj.problems

import java.io.BufferedReader

object No4470 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        for (i in 1..n) {
            sb.append("$i. ${input.readLine()}\n")
        }
        return sb.toString().trimEnd()
    }
}
