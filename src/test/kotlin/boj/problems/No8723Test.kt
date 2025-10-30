package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8723Test : StringSpec({
    "Patyki : https://www.acmicpc.net/problem/8723" {
        val testCases = listOf(
            "3 4 5" to "1",
            "4 4 4" to "2",
            "3 3 5" to "0",
        )

        testCases.forEach { (given, expected) ->
            No8723().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
