package boj.problems

import java.io.BufferedReader
import java.lang.StringBuilder
import kotlin.math.max
import kotlin.math.min

class No3063 {
    private data class Point(val x: Int, val y: Int)

    private data class Rect(val bottomLeft: Point, val topRight: Point) {
        val width: Int get() = topRight.x - bottomLeft.x
        val height: Int get() = topRight.y - bottomLeft.y
        val area: Long get() = width.toLong() * height.toLong()

        fun overlapArea(other: Rect): Long {
            val overlapW = (
                min(this.topRight.x, other.topRight.x) -
                    max(this.bottomLeft.x, other.bottomLeft.x)
            ).coerceAtLeast(0)
            val overlapH = (
                min(this.topRight.y, other.topRight.y) -
                    max(this.bottomLeft.y, other.bottomLeft.y)
            ).coerceAtLeast(0)
            return overlapW.toLong() * overlapH.toLong()
        }
    }

    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) {
            val nums = input.readLine().trim().split(" ").map { it.toInt() }
            val r1 = Rect(Point(nums[0], nums[1]), Point(nums[2], nums[3]))
            val r2 = Rect(Point(nums[4], nums[5]), Point(nums[6], nums[7]))

            val visible = r1.area - r1.overlapArea(r2)
            out.append(visible).append('\n')
        }

        return out.toString().trimEnd()
    }
}
