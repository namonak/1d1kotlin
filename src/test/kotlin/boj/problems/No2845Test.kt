package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2845Test : StringSpec({
    "파티가 끝나고 난 뒤 : https://www.acmicpc.net/problem/2845" {
        val testCases = listOf(
            """
                1 10
                10 10 10 10 10
            """.trimIndent() to "0 0 0 0 0",
            """
                5 20
                99 101 1000 0 97
            """.trimIndent() to "-1 1 900 -100 -3"
        )

        testCases.forEach { (given, expected) ->
            No2845().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
