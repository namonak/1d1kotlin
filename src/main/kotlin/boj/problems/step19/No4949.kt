package boj.problems.step19

import java.io.BufferedReader
import java.util.Stack

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No4949.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No4949 {
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
