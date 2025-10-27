package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28352Test : StringSpec({
    "10! : https://www.acmicpc.net/problem/28352" {
        val testCases = listOf(
            "10" to "6",
            "17" to "588107520"
        )

        testCases.forEach { (given, expected) ->
            No28352().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
