package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No27160Test : StringSpec({
    "할리갈리 : https://www.acmicpc.net/problem/27160" {
        val testCases = listOf(
            """
                3
                BANANA 2
                PLUM 4
                BANANA 3
            """.trimIndent() to "YES",
            """
                4
                STRAWBERRY 1
                BANANA 2
                LIME 3
                PLUM 4
            """.trimIndent() to "NO",
            """
                2
                LIME 5
                LIME 1
            """.trimIndent() to "NO",
            """
                2
                BANANA 5
                BANANA 5
            """.trimIndent() to "NO"
        )

        testCases.forEach { (given, expected) ->
            No27160().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
