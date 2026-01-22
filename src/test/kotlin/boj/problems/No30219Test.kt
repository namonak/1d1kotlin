package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30219Test : StringSpec({
    "Close Triangles : https://www.acmicpc.net/problem/30219" {
        val testCases = listOf(
            """
                2
                1 1
                2 1
                2 2
                4 2
                4 3
                5 3
            """.trimIndent() to "0.0",
            """
                3
                3 3
                2 5
                9 3
                3 2
                2 1
                7 2
                10 8
                10 6
                1 10
            """.trimIndent() to "1.0"
        )

        for ((given, expected) in testCases) {
            No30219().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
