package boj.problems

import java.io.BufferedReader
import java.util.Stack

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No28278.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No28278 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        val stack = Stack<Int>()
        for (i in 0 until n) {
            executeOperation(input.readLine(), stack, result)
        }
        return result.toString().trimEnd()
    }

    private fun executeOperation(readLine: String?, stack: Stack<Int>, result: StringBuilder) {
        val st = readLine!!.split(" ")
        when (st[0]) {
            "1" -> stack.push(st[1].toInt())
            "2" -> result.append(if (stack.empty()) "-1" else stack.pop().toString()).append("\n")
            "3" -> result.append(stack.size.toString()).append("\n")
            "4" -> result.append(if (stack.empty()) "1" else "0").append("\n")
            "5" -> result.append(if (stack.empty()) "-1" else stack.peek().toString()).append("\n")
        }
    }
}
