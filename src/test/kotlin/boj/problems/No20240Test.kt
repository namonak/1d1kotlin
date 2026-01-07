package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20240Test : StringSpec({
    "Integer Square : https://www.acmicpc.net/problem/20240" {
        val testCases = listOf(
            "5" to """
                0 0
                1 2
                -1 3
                -2 1
            """.trimIndent(),
            "3" to """
                Impossible
            """.trimIndent()
        )

        for ((given, expected) in testCases) {
            No20240().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
