package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30596Test : StringSpec({
    "Axis-Aligned Area : https://www.acmicpc.net/problem/30596" {
        val testCases = listOf(
            """
                2
                2
                4
                7
            """.trimIndent() to "8",
            """
                10
                10
                10
                10
            """.trimIndent() to "100"
        )

        testCases.forEach { (given, expected) ->
            No30596().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
