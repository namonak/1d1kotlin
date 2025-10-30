package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2875Test : StringSpec({
    "대회 or 인턴 : https://www.acmicpc.net/problem/2875" {
        val testCases = listOf(
            "6 3 2" to "2",
            "2 1 1" to "0",
            "6 10 3" to "3"
        )

        testCases.forEach { (given, expected) ->
            No2875().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
