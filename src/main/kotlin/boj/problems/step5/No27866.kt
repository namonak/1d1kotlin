package boj.problems.step5

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No27866.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No27866 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine()
        val index = input.readLine().toInt()

        return word[index - 1].toString()
    }
}
