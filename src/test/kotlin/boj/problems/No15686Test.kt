package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15686Test : StringSpec({
    "치킨 배달 : https://www.acmicpc.net/problem/15686" {
        val testCases = listOf(
            """
                5 3
                0 0 1 0 0
                0 0 2 0 1
                0 1 2 0 0
                0 0 1 0 0
                0 0 0 0 2
            """.trimIndent() to "5",
            """
                5 2
                0 2 0 1 0
                1 0 1 0 0
                0 0 0 0 0
                2 0 0 1 1
                2 2 0 1 2
            """.trimIndent() to "10",
            """
                5 1
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
            """.trimIndent() to "11",
            """
                5 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
            """.trimIndent() to "32"
        )

        testCases.forEach { (given, expected) ->
            No15686().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
