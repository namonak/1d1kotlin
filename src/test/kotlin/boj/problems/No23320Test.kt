package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No23320Test : StringSpec({
    "홍익 절대평가 : https://www.acmicpc.net/problem/23320" {
        val testCases = listOf(
            """
                10
                1 2 3 4 5 6 7 8 9 10
                50 3
            """.trimIndent() to "5 8",
            """
                10
                1 2 3 4 5 6 7 8 9 10
                50 6
            """.trimIndent() to "5 5"
        )

        for ((given, expected) in testCases) {
            No23320().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
