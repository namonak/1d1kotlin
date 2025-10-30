package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No11466Test : StringSpec({
    "Alex Origami Squares : https://www.acmicpc.net/problem/11466" {
        val testCases = listOf(
            "210 297" to "105.0",
            "250 100" to "83.333333"
        )

        testCases.forEach { (given, expected) ->
            val actual = No11466().solve(given.reader().buffered()).toDouble()
            // 허용 오차 1e-6
            actual shouldBe (expected.toDouble() plusOrMinus 1e-6)
        }
    }
})
