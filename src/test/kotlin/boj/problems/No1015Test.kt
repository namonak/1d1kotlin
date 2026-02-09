package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1015Test : StringSpec({
    "수열 정렬 : https://www.acmicpc.net/problem/1015" {
        val testCases = listOf(
            """
                3
                2 3 1
            """.trimIndent() to "1 2 0",
            """
                4
                2 1 3 1
            """.trimIndent() to "2 0 3 1",
            """
                8
                4 1 6 1 3 6 1 4
            """.trimIndent() to "4 0 6 1 3 7 2 5"
        )

        for ((given, expected) in testCases) {
            No1015().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
