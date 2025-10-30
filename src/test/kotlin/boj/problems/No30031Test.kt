package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30031Test : StringSpec({
    "지폐 세기 : https://www.acmicpc.net/problem/30031" {
        val testCases = listOf(
            """
                1
                136 68
            """.trimIndent() to "1000",
            """
                4
                136 68
                142 68
                148 68
                154 68
            """.trimIndent() to "66000"
        )

        testCases.forEach { (given, expected) ->
            No30031().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
