package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No21335Test : StringSpec({
    "Another Eruption : https://www.acmicpc.net/problem/21335" {
        val testCases = listOf(
            "50" to "25.066282746",
            "1234" to "124.526709336"
        )

        for ((given, expected) in testCases) {
            val actual = No21335().solve(given.reader().buffered()).toDouble()

            actual shouldBe (expected.toDouble() plusOrMinus 1e-6)
        }
    }
})
