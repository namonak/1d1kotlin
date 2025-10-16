package boj.problems

import java.io.BufferedReader

class No9093 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val testCases = mutableListOf<String>()

        repeat(testCaseCount) {
            testCases.add(input.readLine())
        }

        return testCases.joinToString("\n") { it.split(" ").joinToString(" ") { word -> word.reversed() } }
    }
}
