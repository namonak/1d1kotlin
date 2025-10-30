package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13305Test : StringSpec({
    "주유소 : https://www.acmicpc.net/problem/13305" {
        val testCases = listOf(
            """
                4
                2 3 1
                5 2 4 1
            """.trimIndent() to
                "18",
            """
                4
                3 3 4
                1 1 1 1
            """.trimIndent() to
                "10",
            """
                4
                2 2 2
                5 3 2 4
            """.trimIndent() to
                "20"
        )

        testCases.forEach { (given, expected) ->
            No13305().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
