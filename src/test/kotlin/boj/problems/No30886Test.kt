package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No30886Test : StringSpec({
    "Artistic Souvenir : https://www.acmicpc.net/problem/30886" {
        val testCases = listOf(
            "42" to "86.7269920446",
            "20231125" to "25779373.7414336279"
        )

        testCases.forEach { (given, expected) ->
            val actual = No30886().solve(given.reader().buffered()).toDouble()

            actual shouldBe (expected.toDouble() plusOrMinus 1e-9)
        }
    }
})
