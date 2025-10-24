package boj.problems

import java.io.BufferedReader

class No5524 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val testCase = mutableListOf<String>()
        repeat(testCaseCount) {
            testCase.add(input.readLine())
        }
        return testCase.joinToString("\n") { it.lowercase() }
    }
}
