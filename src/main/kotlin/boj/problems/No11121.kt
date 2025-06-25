package boj.problems

import java.io.BufferedReader

class No11121 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        val t = input.readLine().toInt()
        repeat(t) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            sb.append(if (a == b || a + 1 == b) "OK" else "ERROR").append("\n")
        }
        return sb.toString().trim()
    }
}
