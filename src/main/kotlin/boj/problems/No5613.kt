package boj.problems

import java.io.BufferedReader

class No5613 {
    fun solve(input: BufferedReader): String {
        var result = input.readLine().toInt()
        while (true) {
            val operator = input.readLine()
            if (operator == "=") break
            val operand = input.readLine().toInt()
            result = when (operator) {
                "+" -> result + operand
                "-" -> result - operand
                "*" -> result * operand
                "/" -> result / operand
                else -> throw IllegalArgumentException("Invalid operator: $operator")
            }
        }
        return result.toString()
    }
}
