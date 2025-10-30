package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27389Test : StringSpec({
    "Metronome : https://www.acmicpc.net/problem/27389" {
        val testCases = listOf(
            "16" to "4.00",
            "99" to "24.75",
            "1" to "0.25",
            "4" to "1.00",
            "100000" to "25000.00"
        )

        for ((given, expected) in testCases) {
            val result = No27389().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
