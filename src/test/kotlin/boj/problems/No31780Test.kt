package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31780Test : StringSpec({
    "불사조 : https://www.acmicpc.net/problem/31780" {
        val testCases = listOf(
            "3 2" to "9",
            "5 1" to "10",
            "427 0" to "427"
        )

        testCases.forEach { (input, expected) ->
            No31780().solve(input.reader().buffered()) shouldBe expected
        }
    }
})
