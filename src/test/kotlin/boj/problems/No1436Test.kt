package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1436Test : StringSpec({
    "영화감독 숌 : https://www.acmicpc.net/problem/1436" {
        val testCases = listOf(
            "2" to "1666",
            "3" to "2666",
            "6" to "5666",
            "187" to "66666",
            "500" to "166699"
        )

        testCases.forEach { (given, expected) ->
            No1436().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
