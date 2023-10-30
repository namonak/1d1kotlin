package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11654Test : StringSpec({
    "아스키 코드 : https://www.acmicpc.net/problem/11654" {
        val testCases = listOf(
            "A" to "65",
            "C" to "67",
            "0" to "48",
            "9" to "57",
            "a" to "97",
            "z" to "122"
        )

        testCases.forEach { (given, expected) ->
            No11654.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
