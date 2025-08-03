package boj.problems

import java.io.BufferedReader

class No11024 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val sum = input.readLine()
                .split(" ").sumOf { it.toInt() }
            result.appendLine(sum)
        }

        return result.toString().trim()
    }
}
