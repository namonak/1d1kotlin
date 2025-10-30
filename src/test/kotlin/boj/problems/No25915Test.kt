package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25915Test : StringSpec({
    "연세여 사랑한다 : https://www.acmicpc.net/problem/25915" {
        val testCases = listOf(
            "A" to "92",
            "I" to "84",
            "Z" to "101"
        )

        testCases.forEach { (given, expected) ->
            No25915().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
