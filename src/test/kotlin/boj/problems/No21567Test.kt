package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No21567Test : StringSpec({
    "숫자의 개수 2 : https://www.acmicpc.net/problem/21567" {
        val testCases = listOf(
            """
                150
                266
                427
            """.trimIndent() to """
                3
                1
                0
                2
                0
                0
                0
                2
                0
                0
            """.trimIndent(),
            """
                1
                1
                1
            """.trimIndent() to """
                0
                1
                0
                0
                0
                0
                0
                0
                0
                0
            """.trimIndent(),
            """
                999999
                999999
                999999
            """.trimIndent() to """
                5
                0
                1
                0
                0
                0
                0
                1
                0
                11
            """.trimIndent()
        )

        for ((given, expected) in testCases) {
            val result = No21567().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
