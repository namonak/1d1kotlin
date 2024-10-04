package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No17836Test : StringSpec({
    "공주님을 구해라! : https://www.acmicpc.net/problem/17836" {
        val testCases = listOf(
            """
                6 6 16
                0 0 0 0 1 1
                0 0 0 0 0 2
                1 1 1 0 1 0
                0 0 0 0 0 0
                0 1 1 1 1 1
                0 0 0 0 0 0
            """.trimIndent() to "10",
            """
                3 4 100
                0 0 0 0
                1 1 1 1
                0 0 2 0
            """.trimIndent() to "Fail",
            """                
                5 5 8
                0 0 0 0 0
                0 0 0 0 0
                0 0 2 0 0
                0 0 0 0 0
                0 0 0 0 0
            """.trimIndent() to "8",
        )

        testCases.forEach { (given, expected) ->
            No17836().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
