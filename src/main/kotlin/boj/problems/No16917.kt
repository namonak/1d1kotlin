package boj.problems

import java.io.BufferedReader
import kotlin.math.min

class No16917 {
    fun solve(input: BufferedReader): String {
        val (a, b, c, x, y) = input.readLine().split(" ").map { it.toInt() }
        var minCost = Int.MAX_VALUE

        for (i in 0..(x + y) * 2 step 2) {
            val halfChicken = i / 2
            val remainingX = (x - halfChicken).coerceAtLeast(0)
            val remainingY = (y - halfChicken).coerceAtLeast(0)

            val cost = halfChicken * c * 2 + remainingX * a + remainingY * b
            minCost = min(minCost, cost)
        }

        return minCost.toString()
    }
}
