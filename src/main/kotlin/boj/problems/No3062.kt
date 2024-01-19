package boj.problems

import java.io.BufferedReader

object No3062 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        repeat(input.readLine().toInt()) {
            val num = input.readLine().toInt()
            val reversed = num.toString().reversed().toInt()
            val sum = num + reversed
            sb.append(if (sum.toString() == sum.toString().reversed()) "YES" else "NO").append("\n")
        }
        return sb.toString().trimEnd()
    }
}
