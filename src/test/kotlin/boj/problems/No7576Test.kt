package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7576Test : StringSpec({
    "토마토 : https://www.acmicpc.net/problem/7576" {
        val testCases = listOf(
            """
                6 4
                0 0 0 0 0 0
                0 0 0 0 0 0
                0 0 0 0 0 0
                0 0 0 0 0 1
            """.trimIndent() to "8",
            """
                6 4
                0 -1 0 0 0 0
                -1 0 0 0 0 0
                0 0 0 0 0 0
                0 0 0 0 0 1
            """.trimIndent() to "-1",
            """
                6 4
                1 -1 0 0 0 0
                0 -1 0 0 0 0
                0 0 0 0 -1 0
                0 0 0 0 -1 1
            """.trimIndent() to "6",
            """
                5 5
                -1 1 0 0 0
                0 -1 -1 -1 0
                0 -1 -1 -1 0
                0 -1 -1 -1 0
                0 0 0 0 0
            """.trimIndent() to "14",
            """
                2 2
                1 -1
                -1 1
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No7576().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
