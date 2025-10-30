package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18111Test : StringSpec({
    "마인크래프트 : https://www.acmicpc.net/problem/18111" {
        val testCases = listOf(
            """
                3 4 99
                0 0 0 0
                0 0 0 0
                0 0 0 1
            """.trimIndent()
                to "2 0",
            """
                3 4 1
                64 64 64 64
                64 64 64 64
                64 64 64 63
            """.trimIndent()
                to "1 64",
            """
                3 4 0
                64 64 64 64
                64 64 64 64
                64 64 64 63
            """.trimIndent()
                to "22 63"
        )

        testCases.forEach { (given, expected) ->
            No18111().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
