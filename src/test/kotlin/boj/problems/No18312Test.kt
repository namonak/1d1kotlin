package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18312Test : StringSpec({
    "시각 : https://www.acmicpc.net/problem/18312" {
        val testCases = listOf(
            "5 3" to "11475",
            "0 0" to "3600",
            "0 9" to "684",
            "23 0" to "62100",
            "23 9" to "22248"
        )

        testCases.forEach { (given, expected) ->
            No18312().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
