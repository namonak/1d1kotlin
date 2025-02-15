package boj.problems

import java.io.BufferedReader

class No11134 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val (n, c) = input.readLine().split(" ").map { it.toInt() }
            result.appendLine(n / c + if (n % c != 0) 1 else 0)
        }

        return result.toString().trim()
    }
}
