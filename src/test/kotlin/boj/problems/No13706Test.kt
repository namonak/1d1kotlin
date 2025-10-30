package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13706Test : StringSpec({
    "제곱근 : https://www.acmicpc.net/problem/13706" {
        val testCases = listOf(
            "36" to "6",
            "81" to "9",
            "226576" to "476"
        )

        for ((given, expected) in testCases) {
            No13706().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
