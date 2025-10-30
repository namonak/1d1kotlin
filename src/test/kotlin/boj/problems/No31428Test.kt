package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31428Test : StringSpec({
    "엘리스 트랙 매칭 : https://www.acmicpc.net/problem/31428" {
        val testCases = listOf(
            """
                1
                C
                A
            """.trimIndent() to "0",
            """
                5
                I A I S S
                S
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No31428().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
