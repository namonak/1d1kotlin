package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No20215Test : StringSpec({
    "Cutting Corners : https://www.acmicpc.net/problem/20215" {
        val testCases = listOf(
            "3 4" to "2.0",
            "12 7" to "5.107556011",
            "1 1" to "0.585786438"
        )

        testCases.forEach { (given, expected) ->
            val actual = No20215().solve(given.reader().buffered()).toDouble()

            actual shouldBe (expected.toDouble() plusOrMinus 1e-6)
        }
    }
})
