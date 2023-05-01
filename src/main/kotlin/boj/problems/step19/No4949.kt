package boj.problems.step19

import java.util.Stack

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No4949.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No4949 {
    fun solve(input: String): String {
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
