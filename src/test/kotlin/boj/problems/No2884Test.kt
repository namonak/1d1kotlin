package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2884Test : StringSpec({
    "알람 시계 : https://www.acmicpc.net/problem/2884" {
        val testCases = listOf(
            "10 10" to "9 25",
            "0 30" to "23 45",
            "23 40" to "22 55"
        )

        testCases.forEach { (given, expected) ->
            No2884().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
