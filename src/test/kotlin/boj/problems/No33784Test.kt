package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No33784Test : StringSpec({
    "Gardening : https://www.acmicpc.net/problem/33784" {
        val testCases = listOf(
            """
                4
                6 14
                6 33
                19 33
                19 14
            """.trimIndent() to "247",
            """
                12
                5 1
                5 6
                10 6
                10 7
                1 7
                1 14
                14 14
                14 9
                18 9
                18 3
                12 3
                12 1
            """.trimIndent() to "160"
        )

        for ((given, expected) in testCases) {
            No33784().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
