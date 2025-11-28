package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No34281Test : StringSpec({
    "Class Photo : https://www.acmicpc.net/problem/34281" {
        val testCases = listOf(
            """
                50
                110
            """.trimIndent() to "5500",
            """
                200
                20
            """.trimIndent() to "4000"
        )

        for ((given, expected) in testCases) {
            No34281().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
