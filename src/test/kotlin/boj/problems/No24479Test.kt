package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24479Test : StringSpec({
    "알고리즘 수업 - 깊이 우선 탐색 1 : https://www.acmicpc.net/problem/24479" {
        val testCases = listOf(
            """
                5 5 1
                1 4
                1 2
                2 3
                2 4
                3 4
            """.trimIndent() to """
                1
                2
                3
                4
                0
            """.trimIndent(),
            """
                5 1 1
                1 2
            """.trimIndent() to """
                1
                2
                0
                0
                0
            """.trimIndent(),
            """
                5 1 3
                1 2
            """.trimIndent() to """
                0
                0
                1
                0
                0
            """.trimIndent(),
            """
                5 2 4
                1 2
                2 3
            """.trimIndent() to """
                0
                0
                0
                1
                0
            """.trimIndent(),
            """
                6 1 5
                1 2
            """.trimIndent() to """
                0
                0
                0
                0
                1
                0
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No24479().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
