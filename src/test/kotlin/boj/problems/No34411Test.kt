package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No34411Test : StringSpec({
    "M-Climb : https://www.acmicpc.net/problem/34411" {
        val testCases = listOf(
            """
                50
                10
                2021
            """.trimIndent() to "500",
            """
                26
                7
                2022
            """.trimIndent() to "182"
        )

        for ((given, expected) in testCases) {
            No34411().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
