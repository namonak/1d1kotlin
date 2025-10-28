package boj.problems

import java.io.BufferedReader

class No2338 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().toBigInteger()
        val b = input.readLine().toBigInteger()
        val sb = StringBuilder()

        sb.append("${a + b}\n")
        sb.append("${a - b}\n")
        sb.append("${a * b}\n")

        return sb.toString().trimEnd()
    }
}
