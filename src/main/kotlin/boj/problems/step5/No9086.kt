package boj.problems.step5

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No9086.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No9086 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val words = Array(n) { input.readLine() }

        return words.joinToString("\n") { word ->
            "${word.first()}${word.last()}"
        }
    }
}
