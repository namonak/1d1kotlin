package boj.problems

import java.io.BufferedReader

class No9610 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var q1 = 0
        var q2 = 0
        var q3 = 0
        var q4 = 0
        var axis = 0

        repeat(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            when {
                x == 0 || y == 0 -> axis++
                x > 0 && y > 0 -> q1++
                x < 0 && y > 0 -> q2++
                x < 0 && y < 0 -> q3++
                x > 0 && y < 0 -> q4++
            }
        }

        return """
            Q1: $q1
            Q2: $q2
            Q3: $q3
            Q4: $q4
            AXIS: $axis
            """.trimIndent()
    }
}
