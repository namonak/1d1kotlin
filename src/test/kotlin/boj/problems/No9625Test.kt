package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9625Test : StringSpec({
    "BABBA : https://www.acmicpc.net/problem/9625" {
        val testCases = listOf(
            "1" to "0 1",
            "4" to "2 3",
            "10" to "34 55"
        )

        testCases.forEach { (given, expected) ->
            No9625().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
