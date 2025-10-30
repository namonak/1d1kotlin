package boj.problems

import java.io.BufferedReader

class No10953 {
    fun solve(bufferedReader: BufferedReader): String {
        val numberOfTestCases = bufferedReader.readLine().toInt()
        val result = StringBuilder()

        repeat(numberOfTestCases) {
            val numbers = bufferedReader.readLine().split(",").map { it.toInt() }
            result.append(numbers.sum()).append("\n")
        }

        return result.toString().trimEnd()
    }
}
