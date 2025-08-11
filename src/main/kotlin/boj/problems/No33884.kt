package boj.problems

import java.io.BufferedReader

class No33884 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()

        var minX1 = Long.MAX_VALUE
        var minY1 = Long.MAX_VALUE
        repeat(n) {
            val (x, y) = input.readLine().trim().split(" ").map { it.toLong() }
            if (x < minX1) minX1 = x
            if (y < minY1) minY1 = y
        }

        var minX2 = Long.MAX_VALUE
        var minY2 = Long.MAX_VALUE
        repeat(n) {
            val (x, y) = input.readLine().trim().split(" ").map { it.toLong() }
            if (x < minX2) minX2 = x
            if (y < minY2) minY2 = y
        }

        val a = minX2 - minX1
        val b = minY2 - minY1

        return "$a $b"
    }
}
