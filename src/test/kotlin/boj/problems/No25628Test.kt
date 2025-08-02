package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25628Test : StringSpec({
    "햄버거 만들기 : https://www.acmicpc.net/problem/25628" {
        val testCases = listOf(
            "6 3" to "3",
            "5 4" to "2",
            "1 7" to "0"
        )

        testCases.forEach { (given, expected) ->
            val result = No25628().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
