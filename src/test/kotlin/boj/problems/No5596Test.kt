package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5596Test : StringSpec({
    "시험 점수 : https://www.acmicpc.net/problem/5596" {
        val testCases = listOf(
            """
                100 80 70 60
                80 70 80 90
            """.trimIndent() to "320",
            """
                100 80 70 60
                80 70 60 100
            """.trimIndent() to "310"
        )

        testCases.forEach { (given, expected) ->
            No5596().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
