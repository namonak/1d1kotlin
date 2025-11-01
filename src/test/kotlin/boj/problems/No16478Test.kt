package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No16478Test : StringSpec({
    "원의 분할 : https://www.acmicpc.net/problem/16478" {
        val testCases = listOf(
            "5 5 5" to "5",
            "9 8 13" to "14.625"
        )

        for ((given, expected) in testCases) {
            val actual = No16478().solve(given.reader().buffered()).toDouble()

            actual shouldBe (expected.toDouble() plusOrMinus 1e-6)
        }
    }
})
