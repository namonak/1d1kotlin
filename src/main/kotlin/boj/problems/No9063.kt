package boj.problems

import java.io.BufferedReader

fun main() {
    println(No9063.solve(System.`in`.bufferedReader()).toString())
}

object No9063 {
    fun solve(input: BufferedReader): Int {
        val N = input.readLine().toInt()
        var minX = Int.MAX_VALUE
        var minY = Int.MAX_VALUE
        var maxX = Int.MIN_VALUE
        var maxY = Int.MIN_VALUE

        for (i in 0 until N) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            minX = minOf(minX, x)
            minY = minOf(minY, y)
            maxX = maxOf(maxX, x)
            maxY = maxOf(maxY, y)
        }

        return (maxX - minX) * (maxY - minY)
    }
}
