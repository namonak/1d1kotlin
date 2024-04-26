package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17614Test : StringSpec({
    "369 : https://www.acmicpc.net/problem/17614" {
        val testCases = listOf(
            "14" to "4",
            "36" to "18"
        )

        testCases.forEach { (given, expected) ->
            No17614().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
