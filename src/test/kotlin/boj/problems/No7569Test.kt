package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No7569Test : StringSpec({
    "토마토 : https://www.acmicpc.net/problem/7569" {
        val testCases = listOf(
            """
                5 3 1
                0 -1 0 0 0
                -1 -1 0 1 1
                0 0 0 1 1
            """.trimIndent() to "-1",
            """
                5 3 2
                0 0 0 0 0
                0 0 0 0 0
                0 0 0 0 0
                0 0 0 0 0
                0 0 1 0 0
                0 0 0 0 0
            """.trimIndent() to "4",
            """
                4 3 2
                1 1 1 1
                1 1 1 1
                1 1 1 1
                1 1 1 1
                -1 -1 -1 -1
                1 1 1 -1
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No7569().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
