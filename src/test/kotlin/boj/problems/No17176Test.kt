package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17176Test : StringSpec({
    "암호해독기 : https://www.acmicpc.net/problem/17176" {
        val testCases = listOf(
            """
                11
                44 0 38 41 38 31 23 8 41 30 38
                Hello World
            """.trimIndent() to "y",
            """
                5
                12 3 34 52 0
                apple
            """.trimIndent() to "n"
        )

        for ((given, expected) in testCases) {
            No17176().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
