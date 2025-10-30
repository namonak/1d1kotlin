package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17177Test : StringSpec({
    "내접사각형 만들기 : https://www.acmicpc.net/problem/17177" {
        val testCases = listOf(
            "2 1 1" to "1",
            "1 1 1" to "-1",
            "72 42 23" to "42"
        )

        testCases.forEach { (given, expected) ->
            No17177().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
