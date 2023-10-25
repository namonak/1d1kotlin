package boj.problems.step3

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1110Test : StringSpec({
    "더하기 사이클 : https://www.acmicpc.net/problem/1110" {
        val testCases = arrayOf(
            "26" to "4",
            "55" to "3",
            "1" to "60",
            "0" to "1",
            "71" to "12"
        )

        testCases.forEach { (given, expected) ->
            No1110.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
