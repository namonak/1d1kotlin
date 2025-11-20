package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30204Test : StringSpec({
    "병영외 급식 : https://www.acmicpc.net/problem/30204" {
        val testCases = listOf(
            """
                6 3
                3 7 8 2 4 12
            """.trimIndent() to "1",
            """
                3 4
                5 6 7
            """.trimIndent() to "0"
        )

        for ((given, expected) in testCases) {
            No30204().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
