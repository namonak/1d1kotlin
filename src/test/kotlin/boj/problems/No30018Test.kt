package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30018Test : StringSpec({
    "타슈 : https://www.acmicpc.net/problem/30018" {
        val testCases = listOf(
            """
                4
                3 1 4 2
                2 2 3 3
            """.trimIndent()
                to "2",
            """
                3
                1 1 5
                4 2 1
            """.trimIndent()
                to "4",
            """
                2
                2 1
                2 1
            """.trimIndent()
                to "0"
        )

        testCases.forEach { (given, expected) ->
            No30018().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
