package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14215Test : StringSpec({
    "세 막대 : https://www.acmicpc.net/problem/1463" {
        val testCases = listOf(
            "1 2 3" to "5",
            "2 2 2" to "6",
            "1 100 1" to "3",
            "41 64 16" to "113"
        )

        testCases.forEach { (given, expected) ->
            No14215().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
