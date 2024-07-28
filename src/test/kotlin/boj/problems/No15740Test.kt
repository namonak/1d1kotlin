package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15740Test : StringSpec({
    "A+B - 9 : https://www.acmicpc.net/problem/15740" {
        val testCases = listOf(
            "1 2" to "3",
            "-60 40" to "-20",
            "-999999999 1000000000" to "1",
            "1099511627776 1073741824" to "1100585369600",
            "123456789123456789123456789 987654321987654321987654321" to "1111111111111111111111111110"
        )

        testCases.forEach { (given, expected) ->
            No15740().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
