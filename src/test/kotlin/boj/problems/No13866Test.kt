package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13866Test : StringSpec({
    "팀 나누기 : https://www.acmicpc.net/problem/13866" {
        val testCases = listOf(
            "4 7 10 20" to "7",
            "0 0 1 1000" to "999",
            "1 2 3 4" to "0",
            "1 2 4 4" to "1"
        )

        testCases.forEach { (given, expected) ->
            No13866().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
