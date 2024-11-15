package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15663Test : StringSpec({
    "N과 M (9) : https://www.acmicpc.net/problem/15663" {
        val testCases = listOf(
            """
                3 1
                4 4 2
            """.trimIndent() to """
                2
                4
            """.trimIndent(),
            """
                4 2
                9 7 9 1
            """.trimIndent() to """
                1 7
                1 9
                7 1
                7 9
                9 1
                9 7
                9 9
            """.trimIndent(),
            """
                4 4
                1 1 1 1
            """.trimIndent() to """
                1 1 1 1
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No15663().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
