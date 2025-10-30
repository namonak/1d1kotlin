package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No32888Test : StringSpec({
    "Consolidating Windows : https://www.acmicpc.net/problem/32888" {
        val testCases = listOf(
            "3 4" to "5.0",
            "10000000 320912" to "10005147.900543199866"
        )

        for ((given, expected) in testCases) {
            val actual = No32888().solve(given.reader().buffered()).toDouble()

            actual shouldBe (expected.toDouble() plusOrMinus 1e-9)
        }
    }
})
