package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No10655 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val points = List(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            x to y
        }

        var totalDistance = 0
        for (i in 1 until n) {
            totalDistance += dist(points[i - 1], points[i])
        }

        var maxSaved = 0
        for (i in 1 until n - 1) {
            val direct = dist(points[i - 1], points[i + 1])
            val detour = dist(points[i - 1], points[i]) + dist(points[i], points[i + 1])
            val saved = detour - direct
            maxSaved = maxOf(maxSaved, saved)
        }

        return (totalDistance - maxSaved).toString()
    }

    private fun dist(
        p1: Pair<Int, Int>,
        p2: Pair<Int, Int>
    ): Int {
        return abs(p1.first - p2.first) + abs(p1.second - p2.second)
    }
}
