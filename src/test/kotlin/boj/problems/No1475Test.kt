package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1475Test : StringSpec({
    "방 번호 : https://www.acmicpc.net/problem/1475" {
        val testCases = listOf(
            "9999" to "2",
            "122" to "2",
            "12635" to "1",
            "888888" to "6"
        )

        testCases.forEach { (given, expected) ->
            No1475().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
