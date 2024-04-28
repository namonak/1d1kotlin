package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1145Test : StringSpec({
    "적어도 대부분의 배수 : https://www.acmicpc.net/problem/1145" {
        val testCases = listOf(
            "30 42 70 35 90" to "210",
            "1 2 3 4 5" to "4",
            "30 45 23 26 56" to "1170",
            "3 14 15 92 65" to "195"
        )

        testCases.forEach { (given, expected) ->
            No1145().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
