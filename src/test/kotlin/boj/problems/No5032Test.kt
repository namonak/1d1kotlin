package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5032Test : StringSpec({
    "탄산 음료 : https://www.acmicpc.net/problem/5032" {
        val testCases = listOf(
            "9 0 3" to "4",
            "5 5 2" to "9"
        )

        testCases.forEach { (given, expected) ->
            val result = No5032().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
