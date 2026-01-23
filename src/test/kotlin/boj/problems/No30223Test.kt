package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30223Test : StringSpec({
    "Cut the Cake : https://www.acmicpc.net/problem/30223" {
        val testCases = listOf(
            """
                4
                6 4
                3 4
                4 5
                5 5
            """.trimIndent() to "1.0",
            """
                5
                10 10
                8 15
                13 16
                18 15
                16 10
            """.trimIndent() to "15.0"
        )

        for ((given, expected) in testCases) {
            No30223().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
