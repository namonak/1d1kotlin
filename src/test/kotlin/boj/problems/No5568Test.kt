package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5568Test : StringSpec({
    "카드 놓기 : https://www.acmicpc.net/problem/5568" {
        val testCases = listOf(
            """
                4
                2
                1
                2
                12
                1
            """.trimIndent() to "7",
            """
                6
                3
                72
                2
                12
                7
                2
                1
            """.trimIndent() to "68"
        )

        for ((given, expected) in testCases) {
            No5568().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
