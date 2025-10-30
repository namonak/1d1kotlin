package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No33612Test : StringSpec({
    "피갤컵 : https://www.acmicpc.net/problem/33612" {
        val testCases = listOf(
            "1" to "2024 8",
            "2" to "2025 3",
            "3" to "2025 10",
            "4" to "2026 5",
            "5" to "2026 12"
        )

        for ((given, expected) in testCases) {
            val result = No33612().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
