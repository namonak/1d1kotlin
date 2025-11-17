package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2468Test : StringSpec({
    "안전 영역 : https://www.acmicpc.net/problem/2468" {
        val testCases = listOf(
            """
                5
                6 8 2 6 2
                3 2 3 4 6
                6 7 3 3 2
                7 2 5 3 6
                8 9 5 2 7
            """.trimIndent() to "5",
            """
                7
                9 9 9 9 9 9 9
                9 2 1 2 1 2 9
                9 1 8 7 8 1 9
                9 2 7 9 7 2 9
                9 1 8 7 8 1 9
                9 2 1 2 1 2 9
                9 9 9 9 9 9 9
            """.trimIndent() to "6"
        )

        for ((given, expected) in testCases) {
            No2468().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
