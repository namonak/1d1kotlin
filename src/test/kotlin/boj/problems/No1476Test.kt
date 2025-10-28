package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1476Test : StringSpec({
    "날짜 계산 : https://www.acmicpc.net/problem/1476" {
        val testCases = listOf(
            "1 16 16" to "16",
            "1 1 1" to "1",
            "1 2 3" to "5266",
            "15 28 19" to "7980"
        )

        testCases.forEach { (given, expected) ->
            No1476().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
