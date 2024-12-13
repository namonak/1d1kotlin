package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No16917Test : StringSpec({
    "양념 반 후라이드 반 : https://www.acmicpc.net/problem/16917" {
        val testCases = listOf(
            "1500 2000 1600 3 2" to "7900",
            "1500 2000 1900 3 2" to "8500",
            "1500 2000 500 90000 100000" to "100000000"
        )

        testCases.forEach { (given, expected) ->
            No16917().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
