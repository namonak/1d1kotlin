package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15680Test : StringSpec({
    "연세대학교 : https://www.acmicpc.net/problem/15680" {
        val testCases = listOf(
            "0" to "YONSEI",
            "1" to "Leading the Way to the Future"
        )

        testCases.forEach { (given, expected) ->
            No15680().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
