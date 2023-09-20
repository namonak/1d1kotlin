package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No9093.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No9093 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val testCases = mutableListOf<String>()

        repeat(testCaseCount) {
            testCases.add(input.readLine())
        }

        return testCases.joinToString("\n") { it.split(" ").joinToString(" ") { word -> word.reversed() } }
    }
}
