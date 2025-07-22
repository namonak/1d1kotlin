package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No18198Test : StringSpec({
    "Basketball One-on-One : https://www.acmicpc.net/problem/18198" {
        val testCases = listOf(
            "A2B1A2B2A1A2A2A2" to "A",
            "A2B2A1B2A2B1A2B2A1B2A1A1B1A1A2" to "A"
        )

        testCases.forEach { (given, expected) ->
            val result = No18198().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
