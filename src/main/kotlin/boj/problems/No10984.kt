package boj.problems

import java.io.BufferedReader

class No10984 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = mutableListOf<String>()

        repeat(t) {
            val n = input.readLine().toInt()
            var totalCredits = 0
            var weightedSum = 0.0

            repeat(n) {
                val (c, g) = input.readLine().split(" ").let { it[0].toInt() to it[1].toDouble() }
                totalCredits += c
                weightedSum += c * g
            }

            val gpa = weightedSum / totalCredits
            result.add("$totalCredits ${"%.1f".format(gpa)}")
        }

        return result.joinToString("\n")
    }
}
