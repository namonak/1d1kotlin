package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17256Test : StringSpec({
    "달달함이 넘쳐흘러 : https://www.acmicpc.net/problem/17256" {
        val testCases = listOf(
            """
                15 16 17
                19 32 90
            """.trimIndent()
                to "2 2 75",
            """
                15 8 15
                22 8 22
            """.trimIndent()
                to "7 1 7"
        )

        testCases.forEach { (given, expected) ->
            No17256().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
