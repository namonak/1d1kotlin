package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1043Test : StringSpec({
    "거짓말 : https://www.acmicpc.net/problem/1043" {
        val testCases = listOf(
            """
                4 3
                0
                2 1 2
                1 3
                3 2 3 4
            """.trimIndent() to "3",
            """
                4 1
                1 1
                4 1 2 3 4
            """.trimIndent() to "0",
            """
                4 1
                0
                4 1 2 3 4
            """.trimIndent() to "1",
            """
                4 5
                1 1
                1 1
                1 2
                1 3
                1 4
                2 4 1
            """.trimIndent() to "2",
            """
                10 9
                4 1 2 3 4
                2 1 5
                2 2 6
                1 7
                1 8
                2 7 8
                1 9
                1 10
                2 3 10
                1 4
            """.trimIndent() to "4",
            """
                8 5
                3 1 2 7
                2 3 4
                1 5
                2 5 6
                2 6 8
                1 8
            """.trimIndent() to "5",
            """
                3 4
                1 3
                1 1
                1 2
                2 1 2
                3 1 2 3
            """.trimIndent() to "0"
        )

        for ((given, expected) in testCases) {
            No1043().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
