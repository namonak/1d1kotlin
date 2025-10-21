package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18238Test : StringSpec({
    "ZOAC 2 : https://www.acmicpc.net/problem/18238" {
        val testCases = listOf(
            "ZOAC" to "26",
            "LBOLVUEEPMOIENMG" to "100"
        )

        testCases.forEach { (given, expected) ->
            No18238().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
