package boj.problems

import java.io.BufferedReader
import kotlin.math.max
import kotlin.math.min

private data class Rect(
    val left: Long,
    val top: Long,
    val right: Long,
    val bottom: Long
) {
    fun intersectionArea(other: Rect): Long {
        val width = (min(this.right, other.right) - max(this.left, other.left)).coerceAtLeast(0)
        val height = (min(this.top, other.top) - max(this.bottom, other.bottom)).coerceAtLeast(0)
        return width * height
    }
}

class No8716 {
    fun solve(input: BufferedReader): String {
        val rect1 = input.readLine().split(" ").map { it.toLong() }
            .let { Rect(it[0], it[1], it[2], it[3]) }
        val rect2 = input.readLine().split(" ").map { it.toLong() }
            .let { Rect(it[0], it[1], it[2], it[3]) }
        return rect1.intersectionArea(rect2).toString()
    }
}
