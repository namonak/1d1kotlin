package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2789Test : StringSpec({
    "유학 금지 : https://www.acmicpc.net/problem/2789" {
        val testCases = listOf(
            "LOVA" to "LOV",
            "KARIJERA" to "KJ"
        )

        testCases.forEach { (given, expected) ->
            No2789.solve(given) shouldBe expected
        }
    }
})
