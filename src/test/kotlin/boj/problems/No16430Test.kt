package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16430Test : StringSpec({
    "제리와 톰 : https://www.acmicpc.net/problem/16430" {
        val testCases = listOf(
            "2 7" to "5 7",
            "5 8" to "3 8"
        )

        testCases.forEach { (given, expected) ->
            No16430().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
