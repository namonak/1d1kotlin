package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2480Test : StringSpec({
    "주사위 세개 : https://www.acmicpc.net/problem/2480" {
        val testCases = listOf(
            "3 3 6" to "1300",
            "2 2 2" to "12000",
            "6 2 5" to "600",
        )

        testCases.forEach { (given, expected) ->
            No2480.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
