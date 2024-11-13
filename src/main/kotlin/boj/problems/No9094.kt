package boj.problems

import java.io.BufferedReader

class No9094 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val (n, m) = input.readLine().split(" ").map { it.toInt() }
            var count = 0
            for (a in 1 until n) {
                for (b in a + 1 until n) {
                    if ((a * a + b * b + m) % (a * b) == 0) {
                        count++
                    }
                }
            }
            result.appendLine(count)
        }

        return result.toString().trim()
    }
}
