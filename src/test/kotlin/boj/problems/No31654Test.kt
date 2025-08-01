package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No31654Test : StringSpec({
    "Adding Trouble : https://www.acmicpc.net/problem/31654" {
        val testCases = listOf(
            "2 3 5" to "correct!",
            "1 1 3" to "wrong!",
            "-1 1 0" to "correct!",
        )

        testCases.forEach { (given, expected) ->
            val result = No31654().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
