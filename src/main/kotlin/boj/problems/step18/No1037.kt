package boj.problems.step18

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1037.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No1037 {
    fun solve(input: BufferedReader): Int {
        val count = input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val max = numbers.maxOrNull()!!
        val min = numbers.minOrNull()!!

        return max * min
    }
}
