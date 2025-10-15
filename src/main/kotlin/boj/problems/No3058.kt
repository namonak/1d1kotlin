package boj.problems

import java.io.BufferedReader

class No3058 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()
        repeat(t) {
            val numbers = input.readLine().split(" ").map { it.toInt() }
            val evenNumbers = numbers.filter { it % 2 == 0 }
            val sum = evenNumbers.sum()
            val min = evenNumbers.minOrNull() ?: 0
            result.append("$sum $min\n")
        }
        return result.toString().trimEnd()
    }
}
