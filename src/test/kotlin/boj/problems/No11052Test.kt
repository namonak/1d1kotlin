package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11052Test : StringSpec({
    "카드 구매하기 : https://www.acmicpc.net/problem/11052" {
        val testCases = listOf(
            """
                4
                1 5 6 7
            """.trimIndent() to "10",
            """
                5
                10 9 8 7 6
            """.trimIndent() to "50",
            """
                10
                1 1 2 3 5 8 13 21 34 55
            """.trimIndent() to "55",
            """
                10
                5 10 11 12 13 30 35 40 45 47
            """.trimIndent() to "50",
            """
                4
                5 2 8 10
            """.trimIndent() to "20",
            """
                4
                3 5 15 16
            """.trimIndent() to "18"
        )

        testCases.forEach { (given, expected) ->
            No11052().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
