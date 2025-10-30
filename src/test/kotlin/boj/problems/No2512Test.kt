package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2512Test : StringSpec({
    "예산 : https://www.acmicpc.net/problem/2512" {
        val testCases = listOf(
            """
                4
                120 110 140 150
                485
            """.trimIndent() to "127",
            """
                5
                70 80 30 40 100
                450
            """.trimIndent() to "100"
        )

        testCases.forEach { (given, expected) ->
            No2512().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
