package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No18221Test : StringSpec({
    "교수님 저는 취업할래요 : https://www.acmicpc.net/problem/18221" {
        val testCases = listOf(
            """
                7
                0 5 0 0 0 0 0
                0 0 1 0 0 0 0
                0 0 0 0 0 0 0
                0 0 0 1 1 0 0
                0 0 0 0 0 2 0
                0 0 0 0 0 0 0
                0 0 0 0 0 0 0
            """.trimIndent() to "1",
            """
                9
                0 5 0 0 0 0 0 0 0
                0 1 0 0 0 0 0 0 0
                0 0 0 0 0 0 0 0 0
                0 0 1 1 0 0 0 0 0
                1 0 0 0 0 0 0 0 0
                0 0 2 0 1 0 0 0 0
                0 0 0 0 0 0 0 0 0
                0 0 0 0 0 0 0 0 0
                0 0 0 0 0 0 0 0 0
            """.trimIndent() to "0",
            """
                10
                0 5 0 0 0 0 1 0 0 0
                0 1 0 0 0 0 1 0 0 0
                0 0 0 0 0 0 2 0 0 0
                0 0 1 1 0 0 1 0 0 0
                1 0 0 0 0 0 0 0 0 0
                0 0 1 0 1 0 0 0 0 0
                0 0 0 0 0 0 1 0 0 0
                0 0 0 0 0 0 0 0 0 0
                0 0 0 0 0 0 0 0 0 0
                0 0 0 0 0 0 0 0 0 0
            """.trimIndent() to "1"
        )

        testCases.forEach { (given, expected) ->
            No18221().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
