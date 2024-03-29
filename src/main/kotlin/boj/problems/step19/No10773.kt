package boj.problems.step19

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

object No10773 {
    @Throws(IOException::class)
    fun solve(input: BufferedReader): Int {
        val number = input.readLine().toInt()
        val stack = Stack<Int>()
        makeStack(input, number, stack)
        return makeOutput(stack)
    }

    private fun makeOutput(stack: Stack<Int>): Int {
        var sum = 0
        for (num in stack) {
            sum += num
        }
        return sum
    }

    @Throws(IOException::class)
    private fun makeStack(input: BufferedReader, number: Int, stack: Stack<Int>) {
        for (i in 0 until number) {
            val value = input.readLine().toInt()
            addValue(stack, value)
        }
    }

    private fun addValue(stack: Stack<Int>, value: Int) {
        if (value == 0) {
            stack.pop()
            return
        }
        stack.push(value)
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    output.write(No10773.solve(input).toString())
    input.close()
    output.flush()
    output.close()
}
