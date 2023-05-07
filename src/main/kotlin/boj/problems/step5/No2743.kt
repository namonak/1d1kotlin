package boj.problems.step5

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2743.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2743 {
    fun solve(input: BufferedReader): Int {
        return input.readLine().length
    }
}
