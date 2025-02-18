package boj.problems

import java.io.BufferedReader
import kotlin.math.floor

class No16462 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var sum = 0
        repeat(n) {
            val scoreStr = input.readLine().trim()
            val correctedStr = scoreStr.map { if (it == '0' || it == '6' || it == '9') '9' else it }
                .joinToString("")
            val score = correctedStr.toInt().let { if (it > 100) 100 else it }
            sum += score
        }
        val avg = sum.toDouble() / n
        val result = floor(avg + 0.5).toInt()
        return result.toString()
    }
}
