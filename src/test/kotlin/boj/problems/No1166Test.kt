package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No1166Test : StringSpec({
    "선물 : https://www.acmicpc.net/problem/1166" {
        val testCases = listOf(
            "10 4 2 10" to "2.0",
            "2 2 2 2" to "1.0",
            "1 12 47 5" to "5.0",
            "77 146 523 229" to "52.300000000000004"
        )

        for ((given, expected) in testCases) {
            val actual = No1166().solve(given.reader().buffered())
            actual.toDouble() shouldBe (expected.toDouble() plusOrMinus 1e-9)
        }
    }
})
