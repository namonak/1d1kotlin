package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31798Test : StringSpec({
    "단원평가 : https://www.acmicpc.net/problem/31798" {
        val testCases = listOf(
            "47 53 0" to "10",
            "0 69 10" to "31",
            "23 0 7" to "26"
        )

        for ((given, expected) in testCases) {
            val result = No31798().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
