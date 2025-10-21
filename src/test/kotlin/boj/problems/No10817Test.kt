package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10817Test : StringSpec({
    "세 수 : https://www.acmicpc.net/problem/10817" {
        val testCases = listOf(
            "20 30 10" to "20",
            "30 30 10" to "30",
            "40 40 40" to "40",
            "20 10 10" to "10",
        )

        testCases.forEach { (given, expected) ->
            No10817().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
