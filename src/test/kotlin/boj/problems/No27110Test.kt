package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27110Test : StringSpec({
    "특식 배부 : https://www.acmicpc.net/problem/27110" {
        val testCases = listOf(
            """
                5
                1 7 6
            """.trimIndent() to "11",
            """
                10
                9 8 7
            """.trimIndent() to "24",
            """
                5
                5 5 5
            """.trimIndent() to "15",
            """
                10
                100 200 300
            """.trimIndent() to "30"
        )

        for ((given, expected) in testCases) {
            No27110().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
