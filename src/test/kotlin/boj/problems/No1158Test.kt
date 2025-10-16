package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1158Test : StringSpec({
    "요세푸스 문제 : https://www.acmicpc.net/problem/1158" {
        val testCases = listOf(
            "7 3" to "<3, 6, 2, 7, 5, 1, 4>",
            "8 2" to "<2, 4, 6, 8, 3, 7, 5, 1>",
            "10 3" to "<3, 6, 9, 2, 7, 1, 8, 5, 10, 4>"
        )

        testCases.forEach { (input, expected) ->
            No1158().solve(input.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
