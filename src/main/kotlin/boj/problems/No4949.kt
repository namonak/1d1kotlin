package boj.problems

import java.io.BufferedReader
import java.util.Stack

class No4949 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val line = input.readLine()
            if (line == ".") {
                break
            }
            result.append(checkParenthesis(line)).append("\n")
        }

        return result.toString().trim()
    }

    private fun checkParenthesis(input: String): String {
        val stack = Stack<Char>()

        input.forEach { c ->
            when (c) {
                '(', '[' -> {
                    stack.push(c)
                }
                ')' -> {
                    if (stack.empty() || stack.peek() != '(') {
                        return "no"
                    }
                    stack.pop()
                }
                ']' -> {
                    if (stack.empty() || stack.peek() != '[') {
                        return "no"
                    }
                    stack.pop()
                }
            }
        }

        return if (stack.isEmpty()) "yes" else "no"
    }
}
