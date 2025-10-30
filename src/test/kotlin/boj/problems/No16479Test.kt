package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16479Test : StringSpec({
    "컵라면 측정하기 : https://www.acmicpc.net/problem/16479" {
        val testCases = listOf(
            """
                14
                12 12
            """.trimIndent()
                to "196",
            """
                8
                9 3
            """.trimIndent()
                to "55.0",
            """
                15
                13 6
            """.trimIndent()
                to "212.75"
        )

        testCases.forEach { (given, expected) ->
            No16479().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
