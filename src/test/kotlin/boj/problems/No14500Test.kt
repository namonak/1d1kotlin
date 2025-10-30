package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14500Test : StringSpec({
    "테트로미노 : https://www.acmicpc.net/problem/14500" {
        val testCases = listOf(
            """
                5 5
                1 2 3 4 5
                5 4 3 2 1
                2 3 4 5 6
                6 5 4 3 2
                1 2 1 2 1
            """.trimIndent() to "19",
            """
                4 5
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5
            """.trimIndent() to "20",
            """
                4 10
                1 2 1 2 1 2 1 2 1 2
                2 1 2 1 2 1 2 1 2 1
                1 2 1 2 1 2 1 2 1 2
                2 1 2 1 2 1 2 1 2 1
            """.trimIndent() to "7"
        )

        testCases.forEach { (given, expected) ->
            No14500().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
