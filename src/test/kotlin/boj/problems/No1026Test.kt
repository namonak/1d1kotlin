package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1026Test : StringSpec({
    "보물 : https://www.acmicpc.net/problem/1026" {
        val testCases = listOf(
            """
                5
                1 1 1 6 0
                2 7 8 3 1
            """.trimIndent() to "18",
            """
                3
                1 1 3
                10 30 20
            """.trimIndent() to "80",
            """
                9
                5 15 100 31 39 0 0 3 26
                11 12 13 2 3 4 5 9 1
            """.trimIndent() to "528"
        )

        testCases.forEach { (given, expected) ->
            No1026().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
