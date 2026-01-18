package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2987Test : StringSpec({
    "사과나무 : https://www.acmicpc.net/problem/2987" {
        val testCases = listOf(
            """
                1 1
                5 1
                3 3
                4
                3 1
                3 2
                3 3
                3 4
            """.trimIndent() to """
                4.0
                3
            """.trimIndent(),
            """
                3 2
                5 4
                1 6
                3
                2 4
                3 5
                4 3
            """.trimIndent() to """
                6.0
                3
            """.trimIndent(),
            """
                2 6
                5 1
                7 8
                5
                1 4
                3 5
                6 4
                6 5
                4 7
            """.trimIndent() to """
                15.5
                2
            """.trimIndent()
        )

        for ((given, expected) in testCases) {
            No2987().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
