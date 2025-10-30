package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25631Test : StringSpec({
    "마트료시카 합치기 : https://www.acmicpc.net/problem/25631" {
        val testCases = listOf(
            """
                3
                1 2 3
            """.trimIndent() to "1",
            """
                4
                2 1 4 2
            """.trimIndent() to "2",
            """
                7
                3 3 4 5 2 2 3
            """.trimIndent() to "3"
        )

        for ((given, expected) in testCases) {
            val result = No25631().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
