package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25757Test : StringSpec({
    "임스와 함께하는 미니게임" {
        val testCases = listOf(
            """
                3 Y
                lms0806
                lms0806
                exponential
            """.trimIndent() to "2",
            """
                7 F
                lms0806
                lms0806
                exponential
                lms0806
                lms0806
                exponential
                lms0806
            """.trimIndent() to "1",
            """
                1 O
                lms0806
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No25757.solve(given.reader().buffered()) shouldBe expected
        }
    }
})
