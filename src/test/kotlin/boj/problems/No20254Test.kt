package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20254Test : StringSpec({
    "Site Score : https://www.acmicpc.net/problem/20254" {
        val testCases = listOf(
            "1 1 1 1" to "100",
            "1 10 100 1000" to "7696"
        )

        testCases.forEach { (given, expected) ->
            No20254().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
