package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10773Test : StringSpec({
    "제로 : https://www.acmicpc.net/problem/10773" {
        val testCases = listOf(
            """
                4
                3
                0
                4
                0
            """.trimIndent() to "0",
            """
                10
                1
                3
                5
                4
                0
                0
                7
                0
                0
                6
            """.trimIndent() to "7"
        )

        testCases.forEach { (given, expected) ->
            No10773().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
