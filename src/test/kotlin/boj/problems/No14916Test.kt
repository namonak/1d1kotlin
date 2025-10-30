package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14916Test : StringSpec({
    "거스름돈 : https://www.acmicpc.net/problem/14916" {
        val testCases = listOf(
            "13" to "5",
            "14" to "4"
        )

        testCases.forEach { (given, expected) ->
            No14916().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
