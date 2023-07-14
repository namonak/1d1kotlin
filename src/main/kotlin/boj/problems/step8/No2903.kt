package boj.problems.step8

import kotlin.math.pow

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2903.solve(input.readLine().toInt()).toString())

    input.close()
    output.flush()
    output.close()
}

object No2903 {
    fun solve(input: Int): Int {
        return (2.0.pow(input) + 1).pow(2).toInt()
    }
}
