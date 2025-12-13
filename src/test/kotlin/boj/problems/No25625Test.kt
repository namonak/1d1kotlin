package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25625Test : StringSpec({
    "샤틀버스 : https://www.acmicpc.net/problem/25625" {
        val testCases = listOf(
            "10 3" to "13",
            "10 12" to "2"
        )

        testCases.forEach { (given, expected) ->
            No25625().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
