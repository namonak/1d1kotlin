package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15650Test : StringSpec({
    "N과 M (2) : https://www.acmicpc.net/problem/15650" {
        val testCases = listOf(
            "3 1" to """
                1
                2
                3
            """.trimIndent(),
            "4 2" to """
                1 2
                1 3
                1 4
                2 3
                2 4
                3 4
            """.trimIndent(),
            "4 4" to """
                1 2 3 4
            """.trimIndent(),
        )

        testCases.forEach { (input, expected) ->
            No15650.solve(input) shouldBe expected
        }
    }
})
