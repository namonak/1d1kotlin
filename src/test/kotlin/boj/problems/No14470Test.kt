package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14470Test : StringSpec({
    "전자레인지 : https://www.acmicpc.net/problem/14470" {
        val testCases = listOf(
            """
                -10
                20
                5
                10
                3
            """.trimIndent() to "120",
            """
                35
                92
                31
                50
                11
            """.trimIndent() to "627"
        )

        for ((given, expected) in testCases) {
            No14470().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
