package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2096Test : StringSpec({
    "내려가기 : https://www.acmicpc.net/problem/2096" {
        val testCases = listOf(
            """
                3
                1 2 3
                4 5 6
                4 9 0
            """.trimIndent() to "18 6",
            """
                3
                0 0 0
                0 0 0
                0 0 0
            """.trimIndent() to "0 0"
        )

        testCases.forEach { (given, expected) ->
            No2096().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
