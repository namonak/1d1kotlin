package boj.problems

import java.io.BufferedReader

class No2729 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            val (a, b) = input.readLine().split(" ")
            val sum = a.toBigInteger(2) + b.toBigInteger(2)
            sb.append(sum.toString(2)).append("\n")
        }
        return sb.toString().trim()
    }
}
