package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5545Test : StringSpec({
    "최고의 피자 : https://www.acmicpc.net/problem/5545" {
        val testCases = listOf(
            """
                3
                12 2
                200
                50
                300
                100
            """.trimIndent() to "37",
            """
                4
                20 3
                900
                300
                100
                400
                1300
            """.trimIndent() to "100",
            """
                1
                10 10
                100
                100
            """.trimIndent() to "10"
        )

        testCases.forEach { (given, expected) ->
            No5545().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
