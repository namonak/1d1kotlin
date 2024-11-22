package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1059Test : StringSpec({
    "좋은 구간 : https://www.acmicpc.net/problem/1059" {
        val testCases = listOf(
            """
                4
                1 7 14 10
                2
            """.trimIndent() to "4",
            """
                5
                4 8 13 24 30
                10
            """.trimIndent() to "5",
            """
                5
                10 20 30 40 50
                30
            """.trimIndent() to "0",
            """
                8
                3 7 12 18 25 100 33 1000
                59
            """.trimIndent() to "1065"
        )

        testCases.forEach { (given, expected) ->
            No1059().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
