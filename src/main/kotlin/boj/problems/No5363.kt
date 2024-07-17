package boj.problems

import java.io.BufferedReader

class No5363 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(n) {
            val words = input.readLine().split(" ")
            sb.append(words.drop(2).joinToString(" "))
            sb.append(" ")
            sb.append(words.take(2).joinToString(" "))
            sb.append("\n")
        }
        return sb.toString().trim()
    }
}
