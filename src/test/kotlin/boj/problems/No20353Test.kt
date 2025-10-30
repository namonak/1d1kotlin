package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No20353Test : StringSpec({
    "Atrium : https://www.acmicpc.net/problem/20353" {
        val testCases = listOf(
            "64" to "32.0",
            "1234" to "140.51334456"
        )

        testCases.forEach { (given, expected) ->
            val actual = No20353().solve(given.reader().buffered()).toDouble()

            actual shouldBe (expected.toDouble() plusOrMinus 1e-6)
        }
    }
})
