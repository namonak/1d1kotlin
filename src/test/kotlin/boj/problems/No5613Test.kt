package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5613Test : StringSpec({
    "계산기 프로그램 : https://www.acmicpc.net/problem/5613" {
        val testCases = listOf(
            """
                1
                +
                1
                =
            """.trimIndent() to "2",
            """
                10
                -
                21
                *
                5
                =
            """.trimIndent() to "-55",
            """
                100
                /
                3
                *
                3
                =
            """.trimIndent() to "99"
        )

        testCases.forEach { (given, expected) ->
            No5613().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
