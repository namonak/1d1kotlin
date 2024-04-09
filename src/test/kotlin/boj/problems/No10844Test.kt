package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10844Test : StringSpec({
    "쉬운 계단 수 : https://www.acmicpc.net/problem/10844" {
        val testCases = listOf(
            "1" to "9",
            "2" to "17"
        )

        testCases.forEach { (given, expected) ->
            No10844().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
