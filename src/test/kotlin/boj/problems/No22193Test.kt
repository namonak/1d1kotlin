package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No22193Test : StringSpec({
    "Multiply : https://www.acmicpc.net/problem/22193" {
        val testCases = listOf(
            """
                3 4
                123
                4567
            """.trimIndent() to "561741",
            """
                3 1
                100
                0
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            val actual = No22193().solve(BufferedReader(given.reader()))
            actual shouldBe expected
        }
    }
})
