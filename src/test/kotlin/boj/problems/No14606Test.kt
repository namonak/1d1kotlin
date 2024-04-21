package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14606Test : StringSpec({
    "피자 (Small) : https://www.acmicpc.net/problem/14606" {
        val testCases = listOf(
            "1" to "0",
            "3" to "3",
            "5" to "10",
            "8" to "28"
        )

        testCases.forEach { (given, expected) ->
            No14606().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
