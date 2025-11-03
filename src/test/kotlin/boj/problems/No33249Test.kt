package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No33249Test : StringSpec({
    "Circus Tent : https://www.acmicpc.net/problem/33249" {
        val testCases = listOf(
            "10 5" to "628.31853071795870",
            "4.2 3.1415" to "298.51193482924464"
        )

        for ((given, expected) in testCases) {
            val actual = No33249().solve(given.reader().buffered()).toDouble()

            actual shouldBe (expected.toDouble() plusOrMinus 1e-6)
        }
    }
})
