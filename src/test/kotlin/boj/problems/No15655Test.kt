package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15655Test : StringSpec({
    "N과 M (6) : https://www.acmicpc.net/problem/15655" {
        val testCases = listOf(
            """
                3 1
                4 5 2
            """.trimIndent() to """
                2
                4
                5
            """.trimIndent(),
            """
                4 2
                9 8 7 1
            """.trimIndent() to """
                1 7
                1 8
                1 9
                7 8
                7 9
                8 9
            """.trimIndent(),
            """
                4 4
                1231 1232 1233 1234
            """.trimIndent() to """
                1231 1232 1233 1234
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No15655().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
