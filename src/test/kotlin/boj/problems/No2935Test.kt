package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2935Test : StringSpec({
    "소음" {
        val testCases = listOf(
            """
                100
                *
                100
            """.trimIndent() to "10000",
            """
                1
                *
                100
            """.trimIndent() to "100",
            """
                1000
                +
                1000
            """.trimIndent() to "2000",
            """
                10
                +
                1
            """.trimIndent() to "11"
        )

        testCases.forEach { (given, expected) ->
            No2935.solve(given.reader().buffered()) shouldBe expected
        }
    }
})
