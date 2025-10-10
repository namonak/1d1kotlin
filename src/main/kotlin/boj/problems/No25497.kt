package boj.problems

import java.io.BufferedReader
import java.util.Stack

class No25497 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val str = input.readLine()

        val sStack = Stack<Char>()
        val lStack = Stack<Char>()
        var result = 0

        for (x in str) {
            when {
                x.isDigit() -> result++
                x == 'L' -> lStack.push(x)
                x == 'S' -> sStack.push(x)
                x == 'R' -> if (lStack.isNotEmpty()) {
                    lStack.pop()
                    result++
                } else {
                    break
                }
                x == 'K' -> if (sStack.isNotEmpty()) {
                    sStack.pop()
                    result++
                } else {
                    break
                }
            }
        }
        return result.toString()
    }
}
