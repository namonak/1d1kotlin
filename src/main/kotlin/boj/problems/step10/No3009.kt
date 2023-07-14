package boj.problems.step10

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No3009.solve(input))

    input.close()
    output.flush()
    output.close()
}

private const val INPUT_COORDINATE_COUNT = 3

object No3009 {
    fun solve(input: BufferedReader): String {
        val x = mutableListOf<Int>()
        val y = mutableListOf<Int>()
        for (i in 0 until INPUT_COORDINATE_COUNT) {
            val (x1, y1) = input.readLine().split(" ").map { it.toInt() }
            x.add(x1)
            y.add(y1)
        }

        val resultX = x.find { num -> x.count { it == num } == 1 }
        val resultY = y.find { num -> y.count { it == num } == 1 }

        return "$resultX $resultY"
    }
}
