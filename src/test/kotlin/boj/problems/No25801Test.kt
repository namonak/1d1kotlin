package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25801Test : StringSpec({
    "Odd/Even Strings : https://www.acmicpc.net/problem/25801" {
        val testCases = listOf(
            "geekkeeg" to "0",
            "funnyn" to "1",
            "zztop" to "0/1"
        )

        for ((given, expected) in testCases) {
            No25801().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
