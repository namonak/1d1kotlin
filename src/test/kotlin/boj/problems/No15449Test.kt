package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15449Test : StringSpec({
    "Art : https://www.acmicpc.net/problem/15449" {
        val testCases = listOf(
            "1 2 3 4 5" to "3",
            "1 2 4 8 16" to "0",
        )

        testCases.forEach { (given, expected) ->
            val actual = No15449().solve(BufferedReader(given.reader()))
            actual shouldBe expected
        }
    }
})
