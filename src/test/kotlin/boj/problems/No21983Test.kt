package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No21983Test : StringSpec({
    "Basalt Breakdown : https://www.acmicpc.net/problem/21983" {
        val testCases = listOf(
            "50" to "26.32148026",
            "1234" to "130.76240122"
        )
        val eps = 1e-6

        testCases.forEach { (given, expected) ->
            val result = No21983().solve(given.reader().buffered())
            result.toDouble() shouldBe (expected.toDouble() plusOrMinus eps)
        }
    }
})
