package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2998Test : StringSpec({
    "8진수 : https://www.acmicpc.net/problem/2998" {
        val testCases = listOf(
            "1010" to "12",
            "11001100" to "314"
        )

        testCases.forEach { (given, expected) ->
            No2998().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
