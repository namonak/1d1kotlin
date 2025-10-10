package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2108Test : StringSpec({
    "통계학 : https://www.acmicpc.net/problem/2108" {
        val testCases = listOf(
            """
                5
                1
                3
                8
                -2
                2
            """.trimIndent()
                to """
                    2
                    2
                    1
                    10
                """.trimIndent(),
            """
                1
                4000
            """.trimIndent()
                to """
                    4000
                    4000
                    4000
                    0
                """.trimIndent(),
            """
                5
                -1
                -2
                -3
                -1
                -2
            """.trimIndent()
                to """
                    -2
                    -2
                    -1
                    2
                """.trimIndent(),
            """
                3
                0
                0
                -1
            """.trimIndent()
                to """
                    0
                    0
                    0
                    1
                """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No2108.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
