package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1026Test : StringSpec({
    "보물 : https://www.acmicpc.net/problem/1026" {
        val testCases = listOf(
            "5\n1 1 1 6 0\n2 7 8 3 1\n" to 18,
            "3\n1 1 3\n10 30 20\n" to 80,
            "9\n5 15 100 31 39 0 0 3 26\n11 12 13 2 3 4 5 9 1\n" to 528,
        )

        testCases.forEach { (given, expected) ->
            val actual = No1026.solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
