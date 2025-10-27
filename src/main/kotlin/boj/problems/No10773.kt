package boj.problems

import java.io.BufferedReader
import java.util.Stack

class No10773 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().toInt()
        val stack = Stack<Int>()
        makeStack(input, number, stack)
        return makeOutput(stack).toString()
    }

    private fun makeOutput(stack: Stack<Int>): Int {
        var sum = 0
        for (num in stack) {
            sum += num
        }
        return sum
    }

    private fun makeStack(
        input: BufferedReader,
        number: Int,
        stack: Stack<Int>
    ) {
        for (i in 0 until number) {
            val value = input.readLine().toInt()
            addValue(stack, value)
        }
    }

    private fun addValue(
        stack: Stack<Int>,
        value: Int
    ) {
        if (value == 0) {
            stack.pop()
            return
        }
        stack.push(value)
    }
}
