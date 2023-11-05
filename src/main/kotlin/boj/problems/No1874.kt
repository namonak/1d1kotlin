package boj.problems

import java.io.BufferedReader
import java.util.Stack

object No1874 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val stack = Stack<Int>()
        val result = StringBuilder()
        var current = 1

        repeat(n) {
            val number = input.readLine().toInt()

            while (current <= number) {
                stack.push(current++)
                result.append("+\n")
            }

            if (stack.peek() == number) {
                stack.pop()
                result.append("-\n")
            } else {
                return "NO"
            }
        }

        return result.toString().trimEnd()
    }
}
