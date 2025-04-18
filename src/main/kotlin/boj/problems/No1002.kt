package boj.problems

import java.io.BufferedReader
import kotlin.math.abs
import kotlin.math.sqrt

class No1002 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val parts = input.readLine().split(" ").map { it.toInt() }
            val x1 = parts[0]
            val y1 = parts[1]
            val r1 = parts[2]
            val x2 = parts[3]
            val y2 = parts[4]
            val r2 = parts[5]

            val dx = (x1 - x2).toDouble()
            val dy = (y1 - y2).toDouble()
            val dist = sqrt(dx * dx + dy * dy)

            when {
                dist == 0.0 && r1 == r2 -> result.appendLine(-1) // 무한대 (두 원이 일치하는 경우)
                dist == (r1 + r2).toDouble() || dist == abs(r1 - r2).toDouble() -> result.appendLine(1) // 외접, 내접
                dist > (r1 + r2).toDouble() || dist < abs(r1 - r2).toDouble() -> result.appendLine(0) // 교점 없음
                else -> result.appendLine(2) // 교점 2개
            }
        }

        return result.toString().trimEnd()
    }
}
