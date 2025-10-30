package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17286Test : StringSpec({
    "유미 : https://www.acmicpc.net/problem/17286" {
        val testCases = listOf(
            """
                0 0
                1 0
                2 0
                4 0
            """.trimIndent() to "4",
            """
                -10 -10
                10 10
                -10 10
                10 -10
            """.trimIndent() to "60",
            """
                0 0
                0 1
                0 2
                0 3
            """.trimIndent() to "3",
            """
                0 0
                1 1
                2 2
                3 3
            """.trimIndent() to "4"
        )

        testCases.forEach { (given, expected) ->
            No17286().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
