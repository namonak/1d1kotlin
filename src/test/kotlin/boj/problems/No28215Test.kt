package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28215Test : StringSpec({
    "대피소 : https://www.acmicpc.net/problem/28215" {
        val testCases = listOf(
            """
                5 2
                1 5
                3 0
                3 3
                6 12
                8 9
            """.trimIndent() to "5",
            """
                4 2
                0 0
                0 5
                5 0
                5 5
            """.trimIndent() to "5",
            """
                4 1
                1 0
                2 0
                3 0
                4 0
            """.trimIndent() to "2",
            """
                2 1
                20 23
                5 14
            """.trimIndent() to "24"
        )

        testCases.forEach { (given, expected) ->
            No28215().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
