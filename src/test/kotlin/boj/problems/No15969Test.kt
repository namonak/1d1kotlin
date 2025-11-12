package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15969Test : StringSpec({
    "행복 : https://www.acmicpc.net/problem/15969" {
        val testCases = listOf(
            """
                5
                27 35 92 75 42
            """.trimIndent() to "65",
            """
                8
                85 42 79 95 37 11 72 32
            """.trimIndent() to "84"
        )

        for ((given, expected) in testCases) {
            No15969().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
