package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No5364 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val coords = List(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            x to y
        }

        val current = coords[0]
        var closest = coords[1]
        var minDist = distance(current, closest)

        for (i in 2 until coords.size) {
            val d = distance(current, coords[i])
            if (d < minDist) {
                minDist = d
                closest = coords[i]
            }
        }

        return buildString {
            appendLine("${current.first} ${current.second}")
            appendLine("${closest.first} ${closest.second}")
            append(String.format("%.2f", minDist))
        }
    }

    private fun distance(
        p1: Pair<Int, Int>,
        p2: Pair<Int, Int>
    ): Double {
        val dx = (p1.first - p2.first).toDouble()
        val dy = (p1.second - p2.second).toDouble()
        return sqrt(dx * dx + dy * dy)
    }
}
