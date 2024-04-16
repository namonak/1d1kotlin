package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No19941Test : StringSpec({
    "햄버거 분배 : https://www.acmicpc.net/problem/19941" {
        val testCases = listOf(
            """
                20 1
                HHPHPPHHPPHPPPHPHPHP
            """.trimIndent() to "8",
            """
                20 2
                HHHHHPPPPPHPHPHPHHHP
            """.trimIndent() to "7"
        )

        testCases.forEach { (given, expected) ->
            No19941().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
