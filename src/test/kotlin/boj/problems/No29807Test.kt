package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29807Test : StringSpec({
    "학번을 찾아줘! : https://www.acmicpc.net/problem/29807" {
        val testCases = listOf(
            """
                5
                88 92 90 90 35
            """.trimIndent() to "120908755",
            """
                4
                94 96 90 88
            """.trimIndent() to "17756464",
            """
                4
                50 25 25 50
            """.trimIndent() to "96807975"
        )

        testCases.forEach { (given, expected) ->
            No29807().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
