package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25773Test : StringSpec({
    "Number Maximization : https://www.acmicpc.net/problem/25773" {
        val testCases = listOf(
            "2897" to "9872",
            "15010" to "51100",
            "99" to "99"
        )

        for ((given, expected) in testCases) {
            val result = No25773().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
