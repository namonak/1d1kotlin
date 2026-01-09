package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3986Test : StringSpec({
    "좋은 단어 : https://www.acmicpc.net/problem/3986" {
        val testCases = listOf(
            """
                3
                ABAB
                AABB
                ABBA
            """.trimIndent() to "2",
            """
                3
                AAA
                AA
                AB
            """.trimIndent() to "1",
            """
                1
                ABBABB
            """.trimIndent() to "1"
        )

        for ((given, expected) in testCases) {
            No3986().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
