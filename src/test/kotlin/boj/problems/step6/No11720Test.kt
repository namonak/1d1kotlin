package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11720Test : StringSpec({
    "숫자의 합 : https://www.acmicpc.net/problem/11720" {
        val testCases = listOf(
            """
                1
                1
            """.trimIndent()
                to "1",
            """
                5
                54321
            """.trimIndent()
                to "15",
            """
                25
                7000000000000000000000000
            """.trimIndent()
                to "7",
            """
                11
                10987654321
            """.trimIndent()
                to "46"
        )

        testCases.forEach { (given, expected) ->
            No11720().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
