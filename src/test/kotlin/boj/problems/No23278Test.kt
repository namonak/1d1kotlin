package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly
import java.io.BufferedReader

class No23278Test : StringSpec({
    "영화 평가 : https://www.acmicpc.net/problem/23278" {
        val testCases = listOf(
            """
                5 0 0
                70 99 96 0 30
            """.trimIndent() to "59.0",
            """
                3 1 1
                91 90 50
            """.trimIndent() to "90.0",
            """
                8 2 3
                23 23 23 23 23 23 23 23
            """.trimIndent() to "23",
            """
                10 1 4
                31 52 20 86 47 76 82 27 42 29
            """.trimIndent() to "35.2",
            """
                10 2 2
                1 1 0 0 1 1 0 1 0 2
            """.trimIndent() to "0.666666667"
        )

        testCases.forEach { (given, expectedOutput) ->
            val actualOutput = No23278().solve(BufferedReader(given.reader())).toDouble()
            actualOutput shouldBeExactly expectedOutput.toDouble()
        }
    }
})
