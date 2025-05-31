package boj.problems

import java.io.BufferedReader

class No11944 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val s = n.toString()
        val sb = StringBuilder()

        repeat(n) {
            sb.append(s)
            if (sb.length >= m) {
                return sb.substring(0, m)
            }
        }

        return sb.toString()
    }
}
