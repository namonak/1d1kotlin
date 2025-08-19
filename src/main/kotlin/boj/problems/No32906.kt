package boj.problems

import java.io.BufferedReader
import kotlin.math.abs
import kotlin.math.max

class No32906 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val xsOnAxis = mutableListOf<Int>()
        var maxHeight = 0

        repeat(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            if (y == 0) {
                xsOnAxis.add(x)
            } else {
                maxHeight = max(maxHeight, abs(y))
            }
        }

        if (xsOnAxis.size < 2 || maxHeight == 0) {
            return "0"
        }

        val minX = xsOnAxis.minOrNull()!!
        val maxX = xsOnAxis.maxOrNull()!!
        val maxBase = maxX - minX

        val area = 0.5 * maxBase * maxHeight
        return area.toString()
    }
}
