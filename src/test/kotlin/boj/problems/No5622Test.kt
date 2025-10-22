package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5622Test : StringSpec({
    "다이얼 : https://www.acmicpc.net/problem/5622" {
        val testCases = listOf(
            "WA" to "13",
            "UNUCIC" to "36",
        )

        testCases.forEach { (given, expected) ->
            No5622().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
