package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20061Test : StringSpec({
    "모노미노도미노 2 : https://www.acmicpc.net/problem/20061" {
        val testCases = listOf(
            """
                1
                1 1 1
            """.trimIndent() to """
                0
                2
            """.trimIndent(),
            """
                2
                1 1 1
                2 3 0
            """.trimIndent() to """
                0
                6
            """.trimIndent(),
            """
                4
                1 1 1
                2 3 0
                3 2 2
                3 2 3
            """.trimIndent() to """
                1
                10
            """.trimIndent(),
            """
                5
                1 1 1
                2 3 0
                3 2 2
                3 2 3
                3 1 3
            """.trimIndent() to """
                1
                12
            """.trimIndent(),
            """
                6
                1 1 1
                2 3 0
                3 2 2
                3 2 3
                3 1 3
                2 0 0
            """.trimIndent() to """
                1
                16
            """.trimIndent(),
            """
                7
                1 1 1
                2 3 0
                3 2 2
                3 2 3
                3 1 3
                2 0 0
                3 2 0
            """.trimIndent() to """
                1
                18
            """.trimIndent(),
            """
                8
                1 1 1
                2 3 0
                3 2 2
                3 2 3
                3 1 3
                2 0 0
                3 2 0
                3 1 2
            """.trimIndent() to """
                2
                15
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No20061().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
