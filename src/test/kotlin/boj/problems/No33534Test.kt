package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No33534Test : StringSpec({
    "Hungry Wolves : https://www.acmicpc.net/problem/33534" {
        val testCases = listOf(
            "12" to "12.3",
            "46" to "24.1",
            "96" to "34.8",
        )

        for ((given, expected) in testCases) {
            val result = No33534().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
