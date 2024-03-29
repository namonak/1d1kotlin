package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15964Test : StringSpec({
    "이상한 기호 : https://www.acmicpc.net/problem/15964" {
        val testCases = listOf(
            "4 3" to 7L,
            "3 4" to -7L
        )

        testCases.forEach { (input, expected) ->
            No15964.solve(input.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
