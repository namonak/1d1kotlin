package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15688Test : StringSpec({
    "수 정렬하기 5 : https://www.acmicpc.net/problem/15688" {
        val testCases = listOf(
            """
                5
                5
                4
                3
                2
                1
            """.trimIndent() to """
                1
                2
                3
                4
                5
            """.trimIndent(),
            """
                5
                1
                2
                1
                2
                1
            """.trimIndent() to """
                1
                1
                1
                2
                2
            """.trimIndent(),
            """
                5
                1
                2
                3
                4
                5
            """.trimIndent() to """
                1
                2
                3
                4
                5
            """.trimIndent(),
            """
                6
                0
                0
                0
                0
                0
                0
            """.trimIndent() to """
                0
                0
                0
                0
                0
                0
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No15688().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
