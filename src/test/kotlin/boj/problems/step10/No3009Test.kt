package boj.problems.step10

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No3009Test : StringSpec({
    "네 번째 점 : https://www.acmicpc.net/problem/3009" {
        val testCases = listOf(
            "5 5\n5 7\n7 5" to "7 7",
            "30 20\n10 10\n10 20" to "30 10"
        )

        testCases.forEach { (given, expected) ->
            val actual = No3009.solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
