package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29699Test : StringSpec({
    "Welcome to SMUPC! : https://www.acmicpc.net/problem/29699" {
        val testCases = listOf(
            "2" to "e",
            "15" to "W",
            "14" to "C",
            "1" to "W",
            "1000000" to "T",
        )

        testCases.forEach { (given, expected) ->
            No29699().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
