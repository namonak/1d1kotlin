package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32141Test : StringSpec({
    "카드 게임 (Easy) : https://www.acmicpc.net/problem/32141" {
        val testCases = listOf(
            """
                4 5
                1 2 4 5
            """.trimIndent() to "3",
            """
                4 15
                1 2 4 5
            """.trimIndent() to "-1"
        )

        testCases.forEach { (given, expected) ->
            No32141().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
