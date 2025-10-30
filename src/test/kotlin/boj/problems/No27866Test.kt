package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27866Test : StringSpec({
    "문자와 문자열 : https://www.acmicpc.net/problem/27866" {
        val testCases = listOf(
            """
                Sprout
                3
            """.trimIndent() to "r",
            """
                shiftpsh
                6
            """.trimIndent() to "p",
            """
                Baekjoon
                4
            """.trimIndent() to "k"
        )

        testCases.forEach { (given, expected) ->
            No27866().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
