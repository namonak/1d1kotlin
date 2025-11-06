package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5567Test : StringSpec({
    "결혼식 : https://www.acmicpc.net/problem/5567" {
        val testCases = listOf(
            """
                6
                5
                1 2
                1 3
                3 4
                2 3
                4 5
            """.trimIndent() to "3",
            """
                6
                5
                2 3
                3 4
                4 5
                5 6
                2 5
            """.trimIndent() to "0"
        )

        for ((given, expected) in testCases) {
            No5567().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
