package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5557Test : StringSpec({
    "1학년 : https://www.acmicpc.net/problem/5557" {
        val testCases = listOf(
            """
                11
                8 3 2 4 8 7 2 4 0 8 8
            """.trimIndent() to "10",
            """
                40
                1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 1 1
            """.trimIndent() to "7069052760"
        )

        testCases.forEach { (given, expected) ->
            No5557().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
