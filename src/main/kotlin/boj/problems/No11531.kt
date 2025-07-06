package boj.problems

import java.io.BufferedReader

class No11531 {
    fun solve(input: BufferedReader): String {
        data class ProblemStatus(
            var isSolved: Boolean = false,
            var wrongAttempts: Int = 0,
            var solvedTime: Int = 0
        )

        val problemMap = mutableMapOf<String, ProblemStatus>()

        while (true) {
            val line = input.readLine() ?: break
            if (line == "-1") break

            val (timeStr, problemId, result) = line.split(" ")
            val time = timeStr.toInt()

            val status = problemMap.getOrPut(problemId) { ProblemStatus() }

            if (status.isSolved) continue

            when (result) {
                "wrong" -> status.wrongAttempts++
                "right" -> {
                    status.isSolved = true
                    status.solvedTime = time
                }
            }
        }

        var solvedCount = 0
        var totalPenalty = 0

        for ((_, status) in problemMap) {
            if (status.isSolved) {
                solvedCount++
                totalPenalty += status.solvedTime + status.wrongAttempts * 20
            }
        }

        return "$solvedCount $totalPenalty"
    }
}
