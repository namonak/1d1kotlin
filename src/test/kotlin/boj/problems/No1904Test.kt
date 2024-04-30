package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1904Test : StringSpec({
    "01타일 : https://www.acmicpc.net/problem/1904" {
        val testCases = listOf(
            "1" to "1",
            "2" to "2",
            "3" to "3",
            "4" to "5",
            "5" to "8",
            "6" to "13"
        )

        testCases.forEach { (given, expected) ->
            No1904().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
