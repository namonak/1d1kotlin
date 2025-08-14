package boj.problems

import java.io.BufferedReader

class No11758 {

    data class Point(val x: Long, val y: Long)

    /**
     * CCW(반시계/시계/일직선) 판정:
     *  (b - a) x (c - a)의 z성분 부호를 이용한다.
     *  > 0 : 반시계(1), = 0 : 일직선(0), < 0 : 시계(-1)
     */
    private fun ccwSign(a: Point, b: Point, c: Point): Int {
        val cross = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x)
        return when {
            cross > 0 -> 1
            cross < 0 -> -1
            else -> 0
        }
    }

    private fun BufferedReader.readPoint(): Point {
        val (x, y) = readLine()
            .trim()
            .split(Regex("\\s+"))
            .map { it.toLong() }
        return Point(x, y)
    }

    fun solve(input: BufferedReader): String {
        val p1 = input.readPoint()
        val p2 = input.readPoint()
        val p3 = input.readPoint()
        return ccwSign(p1, p2, p3).toString()
    }
}
