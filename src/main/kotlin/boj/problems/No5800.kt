package boj.problems

import java.io.BufferedReader

class No5800 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        repeat(n) { count ->
            val numbers = input.readLine().split(" ").map { it.toInt() }
            val (_, scores) = numbers.first() to numbers.drop(1).sortedDescending()
            val max = scores.first()
            val min = scores.last()
            val gap = scores.zipWithNext { a, b -> a - b }.maxOrNull() ?: 0
            result.appendLine("Class ${count + 1}")
            result.appendLine("Max $max, Min $min, Largest gap $gap")
        }

        return result.toString().trimEnd()
    }
}
