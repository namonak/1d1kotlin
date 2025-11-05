package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15973Test : StringSpec({
    "두 박스 : https://www.acmicpc.net/problem/15973" {
        val testCases = listOf(
            """
                1 2 3 5
                3 5 8 11
            """.trimIndent() to "POINT",
            """
                3 5 9 10
                5 4 8 11
            """.trimIndent() to "FACE",
            """
                1 2 3 5
                9 3 12 7
            """.trimIndent() to "NULL",
            """
                3 5 9 10
                9 3 12 7
            """.trimIndent() to "LINE"
        )

        for ((given, expected) in testCases) {
            No15973().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
