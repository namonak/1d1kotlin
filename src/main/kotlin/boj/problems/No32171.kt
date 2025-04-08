package boj.problems

import java.io.BufferedReader

class No32171 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        var minX = Int.MAX_VALUE
        var minY = Int.MAX_VALUE
        var maxX = Int.MIN_VALUE
        var maxY = Int.MIN_VALUE

        val result = StringBuilder()

        repeat(n) {
            val (a, b, c, d) = input.readLine().split(" ").map { it.toInt() }

            minX = minOf(minX, a)
            minY = minOf(minY, b)
            maxX = maxOf(maxX, c)
            maxY = maxOf(maxY, d)

            val perimeter = 2 * ((maxX - minX) + (maxY - minY))
            result.appendLine(perimeter)
        }

        return result.toString().trimEnd()
    }
}
