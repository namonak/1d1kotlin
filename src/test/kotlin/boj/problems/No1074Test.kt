package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1074Test : StringSpec({
    "Z : https://www.acmicpc.net/problem/1074" {
        val testCases = listOf(
            "2 3 1" to "11",
            "3 7 7" to "63",
            "1 0 0" to "0",
            "4 7 7" to "63",
            "10 511 511" to "262143",
            "10 512 512" to "786432",
            "15 32767 32767" to "1073741823"
        )

        testCases.forEach { (given, expected) ->
            No1074().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
