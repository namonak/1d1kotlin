package boj.problems

import java.io.BufferedReader

private const val INPUT_COORDINATE_COUNT = 3

class No3009 {
    fun solve(input: BufferedReader): String {
        val x = mutableListOf<Int>()
        val y = mutableListOf<Int>()
        repeat(INPUT_COORDINATE_COUNT) {
            val (x1, y1) = input.readLine().split(" ").map { it.toInt() }
            x.add(x1)
            y.add(y1)
        }

        val resultX = x.find { num -> x.count { it == num } == 1 }
        val resultY = y.find { num -> y.count { it == num } == 1 }

        return "$resultX $resultY"
    }
}
