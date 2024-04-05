package boj.problems

import java.io.BufferedReader
import java.util.Stack

class No17608 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val stack = Stack<Int>()
        repeat(n) {
            val h = input.readLine().toInt()
            while (stack.isNotEmpty() && stack.peek() <= h) {
                stack.pop()
            }
            stack.push(h)
        }
        return stack.size.toString()
    }
}
