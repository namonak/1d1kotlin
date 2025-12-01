package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25850Test : StringSpec({
    "A Game Called Mind : https://www.acmicpc.net/problem/25850" {
        val testCases = listOf(
            """
                2
                3 10 40 50
                2 20 30
            """.trimIndent() to "ABBAA",
            """
                3
                4 40 51 60 70
                3 12 32 42
                5 20 53 80 90 95
            """.trimIndent() to "BCBABACAACCC"
        )

        for ((given, expected) in testCases) {
            No25850().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
