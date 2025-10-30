package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28135Test : StringSpec({
    "Since 1973 : https://www.acmicpc.net/problem/28135" {
        val testCases = listOf(
            "50" to "50",
            "51" to "52"
        )

        testCases.forEach { (given, expected) ->
            No28135().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
