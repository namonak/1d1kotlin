package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32651Test : StringSpec({
    "인간은 무엇인가 : https://www.acmicpc.net/problem/32651" {
        val testCases = listOf(
            "2024" to "Yes",
            "2023" to "No",
            "202400" to "No"
        )

        testCases.forEach { (given, expected) ->
            val result = No32651().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
