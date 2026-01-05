package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No34922Test : StringSpec({
    "사각지대 : https://www.acmicpc.net/problem/34922" {
        val testCases = listOf(
            """
                10 8
                5
            """.trimIndent() to "60.3650459",
            """
                20 20
                15
            """.trimIndent() to "223.285413"
        )

        for ((given, expected) in testCases) {
            val result = No34922().solve(given.reader().buffered()).toDouble()
            val expectedDouble = expected.toDouble()
            result shouldBe (expectedDouble plusOrMinus 1e-6)
        }
    }
})
