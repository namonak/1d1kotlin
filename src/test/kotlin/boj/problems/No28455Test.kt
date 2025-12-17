package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28455Test : StringSpec({
    "Union Maplestory : https://www.acmicpc.net/problem/28455" {
        val testCases = listOf(
            """
                3
                266
                246
                238
            """.trimIndent() to "750 13",
            """
                5
                250
                200
                140
                100
                60
            """.trimIndent() to "750 15"
        )

        for ((given, expected) in testCases) {
            No28455().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
