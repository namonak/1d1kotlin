package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2559Test : StringSpec({
    "수열 : https://www.acmicpc.net/problem/2559" {
        val testCases = listOf(
            """
                10 2
                3 -2 -4 -9 0 3 7 13 8 -3
            """.trimIndent()
                to "21",
            """
                10 5
                3 -2 -4 -9 0 3 7 13 8 -3
            """.trimIndent()
                to "31"
        )

        testCases.forEach { (given, expected) ->
            No2559().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
