package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No5524.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No5524 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val testCase = mutableListOf<String>()
        repeat(testCaseCount) {
            testCase.add(input.readLine())
        }
        return testCase.joinToString("\n") { it.lowercase() }
    }
}
