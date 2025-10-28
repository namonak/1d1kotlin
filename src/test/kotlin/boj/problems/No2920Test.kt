package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2920Test : StringSpec({
    "음계 : https://www.acmicpc.net/problem/2920" {
        val testCases = listOf(
            "1 2 3 4 5 6 7 8" to "ascending",
            "8 7 6 5 4 3 2 1" to "descending",
            "8 1 7 2 6 3 5 4" to "mixed",
            "1 2 3 4 5 6 8 7" to "mixed"
        )

        testCases.forEach { (given, expected) ->
            No2920().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
