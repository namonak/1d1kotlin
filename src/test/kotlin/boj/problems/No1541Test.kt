package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1541Test : StringSpec({
    "잃어버린 괄호 : https://www.acmicpc.net/problem/1541" {
        val testCases = listOf(
            "55-50+40" to "-35",
            "10+20+30+40" to "100",
            "00009-00009" to "0"
        )

        testCases.forEach { (given, expected) ->
            No1541().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
