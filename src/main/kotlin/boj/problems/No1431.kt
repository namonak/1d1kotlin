package boj.problems

import java.io.BufferedReader

class No1431 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val serialNumbers = mutableListOf<String>()
        repeat(n) {
            serialNumbers.add(input.readLine())
        }
        serialNumbers.sortWith(compareBy({ it.length }, { it.sumOf { c -> if (c.isDigit()) c - '0' else 0 } }, { it }))
        return serialNumbers.joinToString("\n")
    }
}
