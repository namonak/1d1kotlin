package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16466Test : StringSpec({
    "콘서트 : https://www.acmicpc.net/problem/16466" {
        val testCases = listOf(
            """
                5
                4 1 2 7 8
            """.trimIndent() to "3",
            """
                3
                7 8 9
            """.trimIndent() to "1",
            """
                5
                5 4 3 2 1
            """.trimIndent() to "6"
        )

        testCases.forEach { (given, expected) ->
            No16466().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
