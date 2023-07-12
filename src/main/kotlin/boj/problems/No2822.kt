package boj.problems

import java.io.BufferedReader

private const val NUMBER_OF_PROBLEMS = 8
private const val TOP_5_SCORES = 5

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2822.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No2822 {
    fun solve(input: BufferedReader): String {
        val scores = Array(NUMBER_OF_PROBLEMS) { input.readLine().toInt() }
        val sortedScores = scores.sorted()
        val sum = sortedScores.takeLast(TOP_5_SCORES).sum()
        val result = StringBuilder()

        result.append("$sum\n")
        for (i in 0 until NUMBER_OF_PROBLEMS) {
            if (scores[i] in sortedScores.takeLast(TOP_5_SCORES)) {
                result.append("${i + 1} ")
            }
        }
        return result.toString().trimEnd()
    }
}
