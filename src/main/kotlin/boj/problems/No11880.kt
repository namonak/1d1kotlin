package boj.problems

import java.io.BufferedReader

class No11880 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val numbers = input.readLine().split(" ").map { it.toInt() }
            val sum = numbers.sum()
            val max = numbers.maxOrNull() ?: 0
            result.append(1L * max * max + 1L * (sum - max) * (sum - max)).append("\n")
        }

        return result.toString().trimEnd()
    }
}
