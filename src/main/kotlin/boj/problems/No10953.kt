package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10953.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10953 {
    fun solve(bufferedReader: BufferedReader): String {
        val numberOfTestCases = bufferedReader.readLine().toInt()
        val result = StringBuilder()

        for (i in 1..numberOfTestCases) {
            val numbers = bufferedReader.readLine().split(",").map { it.toInt() }
            result.append(numbers.sum()).append("\n")
        }

        return result.toString().trimEnd()
    }
}
