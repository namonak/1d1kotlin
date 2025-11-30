package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15366Test : StringSpec({
    "Olivander : https://www.acmicpc.net/problem/15366" {
        val testCases = listOf(
            """
                3
                7 9 5
                6 13 10
            """.trimIndent() to "DA",
            """
                4
                5 3 3 5
                10 2 10 10
            """.trimIndent() to "NE",
            """
                4
                5 2 3 2
                3 8 3 3
            """.trimIndent() to "DA"
        )

        testCases.forEach { (input, expected) ->
            No15366().solve(input.reader().buffered()) shouldBe expected
        }
    }
})
