package boj.problems

import java.io.BufferedReader

class No5361 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(n) {
            val (a, b, c, d, e) = input.readLine().split(" ").map { it.toInt() }
            val result = 350.34 * a + 230.90 * b + 190.55 * c + 125.30 * d + 180.90 * e
            sb.append("${'$'}%.2f".format(result)).append("\n")
        }
        return sb.toString().trim()
    }
}
