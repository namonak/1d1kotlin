package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20833Test : StringSpec({
    "Kuber : https://www.acmicpc.net/problem/20833" {
        val testCases = listOf(
            "4" to "100",
            "7" to "784"
        )

        for ((given, expected) in testCases) {
            val result = No20833().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
