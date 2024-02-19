package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15624Test : StringSpec({
    "피보나치 수 7 : https://www.acmicpc.net/problem/15624" {
        val testCases = listOf(
            "10" to "55",
            "1000" to "517691607"
        )

        testCases.forEach { (given, expected) ->
            No15624.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
