package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20492Test : StringSpec({
    "세금 : https://www.acmicpc.net/problem/20492" {
        val testCases = listOf(
            "10000000" to "7800000 9560000",
            "1000" to "780 956"
        )

        testCases.forEach { (given, expected) ->
            No20492().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
