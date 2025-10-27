package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27323Test : StringSpec({
    "직사각형 : https://www.acmicpc.net/problem/27323" {
        val testCases = listOf(
            """
                2
                3
            """.trimIndent() to "6",
            """
                100
                1
            """.trimIndent() to "100",
            """
                4
                4
            """.trimIndent() to "16"
        )

        testCases.forEach { (given, expected) ->
            No27323().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
