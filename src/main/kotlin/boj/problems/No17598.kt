package boj.problems

import java.io.BufferedReader

class No17598 {
    fun solve(input: BufferedReader): String {
        var lionCount = 0
        var tigerCount = 0

        repeat(9) {
            when (input.readLine()) {
                "Lion" -> lionCount++
                "Tiger" -> tigerCount++
            }
        }

        return if (lionCount > tigerCount) "Lion" else "Tiger"
    }
}
