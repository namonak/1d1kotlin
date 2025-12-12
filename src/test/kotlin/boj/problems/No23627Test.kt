package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No23627Test : StringSpec({
    "driip : https://www.acmicpc.net/problem/23627" {
        val testCases = listOf(
            "dogdriip" to "cute",
            "goricon" to "not cute",
            "hello" to "not cute",
        )

        for ((given, expected) in testCases) {
            No23627().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
