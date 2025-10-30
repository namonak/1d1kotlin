package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24417Test : StringSpec({
    "알고리즘 수업 - 피보나치 수 2 : https://www.acmicpc.net/problem/24417" {
        val testCases = listOf(
            "5" to "5 3",
            "30" to "832040 28",
            "45" to "134903163 43"
        )

        testCases.forEach { (given, expected) ->
            No24417().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
