package boj.problems

import java.io.BufferedReader

class No13985 {
    fun solve(input: BufferedReader): String {
        val tokens = input.readLine().split(" ")

        val a = tokens[0].toInt()
        val operator = tokens[1]
        val b = tokens[2].toInt()
        val c = tokens[4].toInt()

        val result = when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> throw IllegalArgumentException("Unknown operator")
        }

        return if (result == c) "YES" else "NO"
    }
}
