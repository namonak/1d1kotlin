package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2558.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2558 {
    fun solve(input: BufferedReader): Int {
        return input.readLine().toInt() + input.readLine().toInt()
    }
}
