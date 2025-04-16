package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No3412 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val n = input.readLine().toInt()
            var score = 0

            repeat(n) {
                val (x, y) = input.readLine().split(" ").map { it.toDouble() }
                val distance = sqrt(x * x + y * y)

                for (i in 1..10) {
                    if (distance <= i * 20) {
                        score += 11 - i
                        break
                    }
                }
            }

            result.appendLine(score)
        }

        return result.toString().trimEnd()
    }
}
