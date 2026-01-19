package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2175Test : StringSpec({
    "땅 자르기 : https://www.acmicpc.net/problem/2175" {
        val testCases = listOf(
            "0 1 6 0 5 2 2 3" to "4.375 5.125",
            "0 0 100 0 100 100 0 100" to "5000.0 5000.0"
        )

        for ((given, expected) in testCases) {
            No2175().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
