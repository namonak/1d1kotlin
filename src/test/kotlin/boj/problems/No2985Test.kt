package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2985Test : StringSpec({
    "세 수 : https://www.acmicpc.net/problem/2985" {
        val testCases = listOf(
            "5 3 8" to "5+3=8",
            "5 15 3" to "5=15/3",
        )

        testCases.forEach { (given, expected) ->
            No2985().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
