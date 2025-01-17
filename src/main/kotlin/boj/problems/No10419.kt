package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No10419 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val results = mutableListOf<Int>()

        repeat(t) {
            val d = input.readLine().toInt()
            var maxT = 0

            for (i in 0..sqrt(d.toDouble()).toInt()) {
                if (i + i * i <= d) {
                    maxT = i
                } else {
                    break
                }
            }
            results.add(maxT)
        }

        return results.joinToString("\n")
    }
}
