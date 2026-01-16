package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1027Test : StringSpec({
    "고층 건물 : https://www.acmicpc.net/problem/1027" {
        val testCases = listOf(
            """
                15
                1 5 3 2 6 3 2 6 4 2 5 7 3 1 5
            """.trimIndent() to "7",
            """
                1
                10
            """.trimIndent() to "0",
            """
                4
                5 5 5 5
            """.trimIndent() to "2",
            """
                5
                1 2 7 3 2
            """.trimIndent() to "4",
            """
                10
                1000000000 999999999 999999998 999999997 999999996 1 2 3 4 5
            """.trimIndent() to "6"
        )

        for ((given, expected) in testCases) {
            No1027().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
