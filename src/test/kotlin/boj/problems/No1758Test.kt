package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1758Test : StringSpec({
    "알바생 강호 : https://www.acmicpc.net/problem/1758" {
        val testCases = listOf(
            """
                4
                3
                3
                3
                3
            """.trimIndent() to "6",
            """
                3
                3
                2
                3
            """.trimIndent() to "5",
            """
                5
                7
                8
                6
                9
                10
            """.trimIndent() to "30",
            """
                5
                1
                1
                1
                1
                2
            """.trimIndent() to "2",
            """
                3
                1
                2
                3
            """.trimIndent() to "4"
        )

        for ((given, expected) in testCases) {
            No1758().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
