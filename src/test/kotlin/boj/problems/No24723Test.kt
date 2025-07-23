package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No24723Test : StringSpec({
    "녹색거탑 : https://www.acmicpc.net/problem/24723" {
        val testCases = listOf(
            "1" to "2",
            "2" to "4",
        )

        testCases.forEach { (given, expected) ->
            val result = No24723().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
