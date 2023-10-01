package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1357.solve(input).toString())

    input.close()
    output.close()
}

object No1357 {
    fun solve(input: BufferedReader): Int {
        val (x, y) = input.readLine().split(" ").map { it.reversed().toInt() }
        return (x + y).toString().reversed().toInt()
    }
}
