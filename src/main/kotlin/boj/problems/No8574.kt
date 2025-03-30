package boj.problems

import java.io.BufferedReader

class No8574 {
    fun solve(input: BufferedReader): String {
        val (n, k, guardX, guardY) = input.readLine().trim().split("\\s+".toRegex()).map { it.toInt() }
        val kSquared = k.toLong() * k
        var unsafeCount = 0

        repeat(n) {
            val (x, y) = input.readLine().trim().split("\\s+".toRegex()).map { it.toInt() }
            val dx = (x - guardX).toLong()
            val dy = (y - guardY).toLong()
            if (dx * dx + dy * dy > kSquared) {
                unsafeCount++
            }
        }
        return unsafeCount.toString()
    }
}
