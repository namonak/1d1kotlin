package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14652Test : StringSpec({
    "나는 행복합니다 : https://www.acmicpc.net/problem/14652" {
        val testCases = listOf(
            "3 4 6" to "1 2",
            "6 4 14" to "3 2"
        )

        testCases.forEach { (given, expected) ->
            No14652().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
