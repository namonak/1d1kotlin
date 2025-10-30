package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24568Test : StringSpec({
    "Cupcake Party : https://www.acmicpc.net/problem/24568" {
        val testCases = listOf(
            """
                2
                5
            """.trimIndent() to "3",
            """
                2
                4
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No24568().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
