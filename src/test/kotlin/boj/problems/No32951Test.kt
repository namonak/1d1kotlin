package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32951Test : StringSpec({
    "AI 선도대학 : https://www.acmicpc.net/problem/32951" {
        val testCases = listOf(
            "2024" to "0",
            "2031" to "7",
            "9999" to "7975"
        )

        testCases.forEach { (given, expected) ->
            No32951().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
