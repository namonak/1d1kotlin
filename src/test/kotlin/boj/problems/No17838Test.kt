package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17838Test : StringSpec({
    "커맨드 : https://www.acmicpc.net/problem/17838" {
        val testCases = listOf(
            """
                1
                AABBABB
            """.trimIndent() to "1",
            """
                1
                ABBAABB
            """.trimIndent() to "0",
            """
                1
                ABCAFAGHWWE
            """.trimIndent() to "0"
        )

        for ((given, expected) in testCases) {
            val actual = No17838().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})
