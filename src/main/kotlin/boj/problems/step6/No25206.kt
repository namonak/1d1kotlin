package boj.problems.step6

import java.io.BufferedReader

object No25206 {
    private val gradeToScore = mapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0
    )

    fun solve(input: BufferedReader): String {
        val totalScore = mutableListOf<Pair<Double, Double>>()
        var result = 0.0

        for (i in 1..20) {
            val (_, credit, grade) = input.readLine().split(" ")
            if (grade != "P") {
                totalScore.add(Pair(credit.toDouble(), gradeToScore[grade] ?: 0.0))
            }
        }

        totalScore.forEach { (credit, score) ->
            result += credit * score
        }

        return String.format("%.6f", result / totalScore.sumOf { it.first })
    }
}
