package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2003Test : StringSpec({
    "수들의 합 2 : https://www.acmicpc.net/problem/2003" {
        val testCases = listOf(
            """
                4 2
                1 1 1 1
            """.trimIndent()
                to "3",
            """
                10 5
                1 2 3 4 2 5 3 1 1 2
            """.trimIndent()
                to "3"
        )

        testCases.forEach { (given, expected) ->
            No2003().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
