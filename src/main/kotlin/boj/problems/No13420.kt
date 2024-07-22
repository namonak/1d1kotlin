package boj.problems

import java.io.BufferedReader

class No13420 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        repeat(n) {
            val (a, op, b, _, c) = input.readLine().split(" ")
            val answer = when (op) {
                "+" -> a.toLong() + b.toLong()
                "-" -> a.toLong() - b.toLong()
                "*" -> a.toLong() * b.toLong()
                "/" -> a.toLong() / b.toLong()
                else -> throw IllegalArgumentException("Invalid operator")
            }
            result.append(if (answer.toString() == c) "correct" else "wrong answer").append("\n")
        }
        return result.toString().trim()
    }
}
