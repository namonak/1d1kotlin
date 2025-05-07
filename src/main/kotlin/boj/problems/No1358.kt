package boj.problems

import java.io.BufferedReader

class No1358 {
    fun solve(input: BufferedReader): String {
        val (w, h, x, y, p) = input.readLine().split(" ").map(String::toInt)
        val r = h / 2
        val cy = y + r
        var count = 0

        repeat(p) {
            val (px, py) = input.readLine().split(" ").map(String::toInt)

            if (px in x..(x + w) && py in y..(y + h)) {
                count++
            } else {
                val dx1 = px - x
                val dy1 = py - cy
                if (dx1 * dx1 + dy1 * dy1 <= r * r) {
                    count++
                } else {
                    val dx2 = px - (x + w)
                    val dy2 = py - cy
                    if (dx2 * dx2 + dy2 * dy2 <= r * r) {
                        count++
                    }
                }
            }
        }

        return count.toString()
    }
}
