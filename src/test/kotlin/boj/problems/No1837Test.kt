package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1837Test : StringSpec({
    "암호제작 : https://www.acmicpc.net/problem/1837" {
        val testCases = listOf(
            "143 10" to "GOOD",
            "77 12" to "BAD 7"
        )

        testCases.forEach { (given, expected) ->
            No1837().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
