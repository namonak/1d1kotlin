package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1431.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No1431 {
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
