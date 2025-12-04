package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17851Test : StringSpec({
    "This Problem’s a Slam Dunk : https://www.acmicpc.net/problem/17851" {
        val testCases = listOf(
            """
                67 64 61 70 58
                62 68 65 71 59
            """.trimIndent() to "0",
            """
                58 64 61 67 70
                57 71 62 68 65
            """.trimIndent() to "1"
        )

        for ((given, expected) in testCases) {
            No17851().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
