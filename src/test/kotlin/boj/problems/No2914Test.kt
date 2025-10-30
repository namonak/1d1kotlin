package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2914Test : StringSpec({
    "저작권 : https://www.acmicpc.net/problem/2914" {
        val testCases = listOf(
            "38 24" to "875",
            "1 100" to "100",
            "10 10" to "91"
        )

        testCases.forEach { (given, expected) ->
            No2914().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
