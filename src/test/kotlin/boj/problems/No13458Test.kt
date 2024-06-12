package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13458Test : StringSpec({
    "시험 감독 : https://www.acmicpc.net/problem/13458" {
        val testCases = listOf(
            """
                1
                1
                1 1
            """.trimIndent() to "1",
            """
                3
                3 4 5
                2 2
            """.trimIndent() to "7",
            """
                5
                1000000 1000000 1000000 1000000 1000000
                5 7
            """.trimIndent() to "714290",
            """
                5
                10 9 10 9 10
                7 20
            """.trimIndent() to "10",
            """
                5
                10 9 10 9 10
                7 2
            """.trimIndent() to "13"
        )

        testCases.forEach { (given, expected) ->
            No13458().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
