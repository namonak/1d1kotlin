package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No30315Test : StringSpec({
    "King's Keep : https://www.acmicpc.net/problem/30315" {
        val testCases = listOf(
            """
                3
                0 0
                9 9
                0 9
            """.trimIndent() to 9.0,
            """
                5
                -3 5
                6 8
                1 2
                5 -4
                -7 -9
            """.trimIndent() to 8.405705684
        )

        val tolerance = 1e-6

        testCases.forEach { (given, expected) ->
            val result = No30315().solve(given.reader().buffered()).toDouble()
            result shouldBe (expected plusOrMinus tolerance)
        }
    }
})
