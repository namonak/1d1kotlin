package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13277Test : StringSpec({
    "큰 수 곱셈 : https://www.acmicpc.net/problem/13277" {
        val testCases = listOf(
            "1 2" to "2",
            "3 4" to "12",
            "893724358493284 238947328947329" to "213553048277135320552236238436"
        )

        testCases.forEach { (given, expected) ->
            No13277().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
