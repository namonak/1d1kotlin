package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No13221 {
    fun solve(input: BufferedReader): String {
        val (targetX, targetY) = input.readLine().split(" ").map { it.toInt() }
        val n = input.readLine().toInt()

        var minDistance = Int.MAX_VALUE
        var closestTaxi = Pair(0, 0)

        repeat(n) {
            val (taxiX, taxiY) = input.readLine().split(" ").map { it.toInt() }
            val distance = abs(targetX - taxiX) + abs(targetY - taxiY)

            if (distance < minDistance) {
                minDistance = distance
                closestTaxi = Pair(taxiX, taxiY)
            }
        }

        return "${closestTaxi.first} ${closestTaxi.second}"
    }
}
