package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32929Test : StringSpec({
    "UOS 문자열 : https://www.acmicpc.net/problem/32929" {
        val testCases = listOf(
            "5" to "O",
            "1000000000" to "U"
        )

        testCases.forEach { (given, expected) ->
            No32929().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
