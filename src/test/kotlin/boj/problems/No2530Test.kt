package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2530Test : StringSpec({
    "인공지능 시계 : https://www.acmicpc.net/problem/2530" {
        val testCases = listOf(
            """
                14 30 0
                200
            """.trimIndent()
                to "14 33 20",
            """
                17 40 45
                6015
            """.trimIndent()
                to "19 21 0",
            """
                23 48 59
                2515
            """.trimIndent()
                to "0 30 54"
        )

        testCases.forEach { (input, output) ->
            No2530().solve(input.reader().buffered()) shouldBe output
        }
    }
})
