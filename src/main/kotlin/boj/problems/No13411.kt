package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No13411 {
    data class Robot(val index: Int, val time: Double)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val robots = mutableListOf<Robot>()

        repeat(n) { idx ->
            val (x, y, v) = input.readLine().split(" ").map { it.toDouble() }
            val distance = sqrt(x * x + y * y)
            val time = distance / v
            robots += Robot(idx + 1, time)
        }

        return robots
            .sortedWith(compareBy({ it.time }, { it.index }))
            .joinToString("\n") { it.index.toString() }
    }
}
