package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5533Test : StringSpec({
    "유니크 https://www.acmicpc.net/problem/5533" {
        val testCases = listOf(
            """
                5
                100 99 98
                100 97 92
                63 89 63
                99 99 99
                89 97 98
            """.trimIndent() to """
                0
                92
                215
                198
                89
            """.trimIndent(),
            """
                3
                89 92 77
                89 92 63
                89 63 77
            """.trimIndent() to """
                0
                63
                63
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No5533().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
