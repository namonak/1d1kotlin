package boj.problems

import java.io.BufferedReader

class No9063 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var minX = Int.MAX_VALUE
        var minY = Int.MAX_VALUE
        var maxX = Int.MIN_VALUE
        var maxY = Int.MIN_VALUE

        repeat(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            minX = minOf(minX, x)
            minY = minOf(minY, y)
            maxX = maxOf(maxX, x)
            maxY = maxOf(maxY, y)
        }

        return ((maxX - minX) * (maxY - minY)).toString()
    }
}
