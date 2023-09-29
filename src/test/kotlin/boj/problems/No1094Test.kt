package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1094Test : StringSpec({
    "막대기 : https://www.acmicpc.net/problem/1094" {
        val testCases = listOf(
            23 to 4,
            32 to 1,
            64 to 1,
            48 to 2
        )

        testCases.forEach { (given, expected) ->
            No1094.solve(given) shouldBe expected
        }
    }
})
