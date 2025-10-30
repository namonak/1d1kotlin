package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No22193Test : StringSpec({
    "Multiply : https://www.acmicpc.net/problem/22193" {
        val testCases = listOf(
            """
                3 4
                123
                4567
            """.trimIndent() to "561741",
            """
                3 1
                100
                0
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No22193().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
