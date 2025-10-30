package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1676Test : StringSpec({
    "팩토리얼 0의 개수 : https://www.acmicpc.net/problem/1676" {
        val testCases = listOf(
            "10" to "2",
            "3" to "0"
        )

        testCases.forEach { (given, expected) ->
            No1676().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
