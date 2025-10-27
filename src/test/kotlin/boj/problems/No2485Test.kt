package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2485Test : StringSpec({
    "가로수 : https://www.acmicpc.net/problem/2485" {
        val testCases = listOf(
            """
                4
                1
                3
                7
                13
            """.trimIndent() to "3",
            """
                4
                2
                6
                12
                18
            """.trimIndent() to "5"
        )

        testCases.forEach { (given, expected) ->
            No2485().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
