package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2805Test : StringSpec({
    "나무 자르기 : https://www.acmicpc.net/problem/2805" {
        val testCases = listOf(
            """
                4 7
                20 15 10 17
            """.trimIndent() to "15",
            """
                5 20
                4 42 40 26 46
            """.trimIndent() to "36"
        )

        testCases.forEach { (given, expected) ->
            No2805().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
