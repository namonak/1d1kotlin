package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29835Test : StringSpec({
    "Palindroom : https://www.acmicpc.net/problem/29835" {
        val testCases = listOf(
            """
                4
                ABBA
            """.trimIndent() to """
                0
                ABBA
            """.trimIndent(),
            """
                4
                ABCC
            """.trimIndent() to """
                2
                ABBA
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            val result = No29835().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
