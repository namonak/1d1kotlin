package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1912Test : StringSpec({
    "연속합 : https://www.acmicpc.net/problem/1912" {
        val testCases = listOf(
            """
                10
                10 -4 3 1 5 6 -35 12 21 -1
            """.trimIndent()
                to "33",
            """
                10
                2 1 -4 3 4 -4 6 5 -5 1
            """.trimIndent()
                to "14",
            """
                5
                -1 -2 -3 -4 -5
            """.trimIndent()
                to "-1"
        )

        testCases.forEach { (given, expected) ->
            No1912.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
