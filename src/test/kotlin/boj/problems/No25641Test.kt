package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25641Test : StringSpec({
    "균형 잡힌 소떡소떡 : https://www.acmicpc.net/problem/25641" {
        val testCases = listOf(
            """
                7
                sttstts
            """.trimIndent() to "stts",
            """
                4
                ttts
            """.trimIndent() to "ts",
            """
                4
                stst
            """.trimIndent() to "stst"
        )

        for ((given, expected) in testCases) {
            No25641().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
