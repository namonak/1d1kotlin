package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10984Test : StringSpec({
    "내 학점을 구해줘 : https://www.acmicpc.net/problem/10984" {
        val testCases = listOf(
            """
                2
                4
                3 4.3
                2 2.0
                4 0.0
                2 4.0
                3
                4 0.0
                4 0.0
                3 0.0
            """.trimIndent() to """
                11 2.3
                11 0.0
            """.trimIndent(),
            """
                2
                4
                3 4.3
                2 2
                4 0.0
                2 4.0
                3
                4 0.0
                4 0
                3 0
            """.trimIndent() to """
                11 2.3
                11 0.0
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No10984().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
