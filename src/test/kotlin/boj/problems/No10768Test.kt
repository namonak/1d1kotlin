package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10768Test : StringSpec({
    "특별한 날 : https://www.acmicpc.net/problem/10768" {
        val testCases = listOf(
            """
                1
                7
            """.trimIndent() to "Before",
            """
                8
                31
            """.trimIndent() to "After",
            """
                2
                18
            """.trimIndent() to "Special"
        )

        testCases.forEach { (given, expected) ->
            No10768().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
