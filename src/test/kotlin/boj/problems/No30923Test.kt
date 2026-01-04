package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30923Test : StringSpec({
    "크냑과 3D 프린터 : https://www.acmicpc.net/problem/30923" {
        val testCases = listOf(
            """
                3
                3 1 2
            """.trimIndent() to "26",
            """
                3
                1 2 3
            """.trimIndent() to "24"
        )

        for ((given, expected) in testCases) {
            No30923().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
