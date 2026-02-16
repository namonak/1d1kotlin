package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2644Test : StringSpec({
    "촌수계산 : https://www.acmicpc.net/problem/2644" {
        val testCases = listOf(
            """
                9
                7 3
                7
                1 2
                1 3
                2 7
                2 8
                2 9
                4 5
                4 6
            """.trimIndent() to "3",
            """
                9
                8 6
                7
                1 2
                1 3
                2 7
                2 8
                2 9
                4 5
                4 6
            """.trimIndent() to "-1"
        )

        for ((given, expected) in testCases) {
            No2644().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
