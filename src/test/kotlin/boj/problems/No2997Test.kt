package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2997Test : StringSpec({
    "네 번째 수 : https://www.acmicpc.net/problem/2997" {
        val testCases = listOf(
            "4 6 8" to "10",
            "10 1 4" to "7"
        )

        for ((given, expected) in testCases) {
            No2997().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
