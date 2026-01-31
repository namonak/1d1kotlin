package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29753Test : StringSpec({
    "최소 성적 : https://www.acmicpc.net/problem/29753" {
        val testCases = listOf(
            """
                5 3.59
                4 A+
                3 B+
                3 C+
                1 D0
                3
            """.trimIndent() to "A+",
            """
                3 4.44
                5 A+
                4 A+
                1
            """.trimIndent() to "A0",
            """
                5 2.54
                3 B+
                2 B0
                2 C+
                2 C0
                1
            """.trimIndent() to "F",
            """
                5 3.60
                4 A+
                3 B+
                3 C+
                1 D0
                3
            """.trimIndent() to "impossible"
        )

        for ((given, expected) in testCases) {
            No29753().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
