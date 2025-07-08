package boj.problems

import java.io.BufferedReader

class No11121 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        val t = input.readLine().toInt()
        repeat(t) {
            val (sent, received) = input.readLine().split(' ')
            sb.appendLine(if (sent == received) "OK" else "ERROR")
        }
        return sb.toString().trimEnd()
    }
}
