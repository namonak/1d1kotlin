package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No23375Test : StringSpec({
    "Arm Coordination : https://www.acmicpc.net/problem/23375" {
        val testCases = listOf(
            """
                -3 6
                5
            """.trimIndent() to """
                2 11
                2 1
                -8 1
                -8 11
            """.trimIndent(),
            """
                0 0
                10
            """.trimIndent() to """
                10 10
                10 -10
                -10 -10
                -10 10
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No23375().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
