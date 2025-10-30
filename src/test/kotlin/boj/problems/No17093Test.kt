package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17093Test : StringSpec({
    "Total Circle : https://www.acmicpc.net/problem/17093" {
        val testCases = listOf(
            """
                1 1
                0 0
                1000000 1000000
            """.trimIndent() to "2000000000000",
            """
                4 4
                2 6
                3 1
                1 7
                8 9
                4 3
                5 2
                9 6
                6 4
            """.trimIndent() to "65"
        )

        testCases.forEach { (given, expected) ->
            val result = No17093().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
