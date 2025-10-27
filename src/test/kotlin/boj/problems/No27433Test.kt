package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27433Test : StringSpec({
    "팩토리얼 2 : https://www.acmicpc.net/problem/27433" {
        val testCases = listOf(
            "10" to "3628800",
            "0" to "1",
            "20" to "2432902008176640000"
        )

        testCases.forEach { (given, expected) ->
            No27433().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
