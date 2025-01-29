package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2991Test : StringSpec({
    "사나운 개 : https://www.acmicpc.net/problem/2991" {
        val testCases = listOf(
            """
                2 2 3 3
                1 3 4
            """.trimIndent() to """
                2
                1
                0
            """.trimIndent(),
            """
                2 3 4 5
                4 9 5
            """.trimIndent() to """
                1
                0
                0
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No2991().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
