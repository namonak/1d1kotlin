package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2847Test : StringSpec({
    "게임을 만든 동준이 : https://www.acmicpc.net/problem/2847" {
        val testCases = listOf(
            """
                3
                5
                5
                5
            """.trimIndent()
                to "3",
            """
                4
                5
                3
                7
                5
            """.trimIndent()
                to "6"
        )

        testCases.forEach { (given, expected) ->
            No2847().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
