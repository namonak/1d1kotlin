package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No31450Test : StringSpec({
    "Everyone is a winner : https://www.acmicpc.net/problem/31450" {
        val testCases = listOf(
            "6 3" to "Yes",
            "5 3" to "No"
        )

        testCases.forEach { (given, expected) ->
            val result = No31450().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
