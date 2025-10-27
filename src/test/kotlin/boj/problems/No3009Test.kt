package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3009Test : StringSpec({
    "네 번째 점 : https://www.acmicpc.net/problem/3009" {
        val testCases = listOf(
            """
                5 5
                5 7
                7 5
            """.trimIndent() to "7 7",
            """
                30 20
                10 10
                10 20
            """.trimIndent() to "30 10"
        )

        testCases.forEach { (given, expected) ->
            No3009().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
