package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No14471Test : StringSpec({
    "포인트 카드 : https://www.acmicpc.net/problem/14471" {
        val testCases = listOf(
            """
                4 5
                1 7
                6 2
                3 5
                4 4
                0 8
            """.trimIndent() to "4",
            """
                5 4
                5 5
                8 2
                3 7
                8 2
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            val actual = No14471().solve(BufferedReader(given.reader()))
            actual shouldBe expected
        }
    }
})
