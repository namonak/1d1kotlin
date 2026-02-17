package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16395Test : StringSpec({
    "파스칼의 삼각형 : https://www.acmicpc.net/problem/16395" {
        val testCases = listOf(
            "5 3" to "6",
            "11 3" to "45"
        )

        for ((given, expected) in testCases) {
            No16395().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
