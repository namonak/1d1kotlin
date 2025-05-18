package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No13900Test : StringSpec({
    "순서쌍의 곱의 합 : https://www.acmicpc.net/problem/13900" {
        val testCases = listOf(
            """
                3
                2 3 4
            """.trimIndent() to "26",
            """
                4
                1 2 3 4
            """.trimIndent() to "35",
            """
                4
                2 3 2 4
            """.trimIndent() to "44"
        )

        testCases.forEach { (given, expected) ->
            No13900().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
