package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20673Test : StringSpec({
    "Covid-19 : https://www.acmicpc.net/problem/20673" {
        val testCases = listOf(
            """
                50
                7
            """.trimIndent() to "White",
            """
                60
                40
            """.trimIndent() to "Red",
            """
                15
                12
            """.trimIndent() to "Yellow"
        )

        testCases.forEach { (given, expected) ->
            No20673().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
