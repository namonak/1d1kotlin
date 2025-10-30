package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15781Test : StringSpec({
    "헬멧과 조끼 : https://www.acmicpc.net/problem/15781" {
        val testCases = listOf(
            """
                5 7
                10 60 15 20 7
                1 2 3 7 5 1 3
            """.trimIndent() to "67",
            """
                2 3
                1 1000000000
                20 18 1000000000
            """.trimIndent() to "2000000000"
        )

        testCases.forEach { (given, expected) ->
            No15781().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
