package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2010Test : StringSpec({
    "플러그 : https://www.acmicpc.net/problem/2010" {
        val testCases = listOf(
            """
                3
                1
                1
                1
            """.trimIndent() to "1",
            """
                2
                5
                8
            """.trimIndent() to "12"
        )

        testCases.forEach { (given, expected) ->
            val result = No2010().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
