package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1297Test : StringSpec({
    "TV 크기 : https://www.acmicpc.net/problem/1297" {
        val testCases = listOf(
            "52 9 16" to "25 45",
            "7 2 3" to "3 5",
            "13 7 10" to "7 10",
            "7 32 47" to "3 5",
            "11 15 16" to "7 8"
        )

        testCases.forEach { (given, expected) ->
            No1297().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
