package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3213Test : StringSpec({
    "피자 : https://www.acmicpc.net/problem/3213" {
        val testCases = listOf(
            """
                3
                1/2
                3/4
                3/4
            """.trimIndent() to "3",
            """
                5
                1/2
                1/4
                3/4
                1/4
                1/2
            """.trimIndent() to "3",
            """
                6
                3/4
                1/2
                3/4
                1/2
                1/4
                1/2
            """.trimIndent() to "4"
        )

        testCases.forEach { (given, expected) ->
            No3213().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
