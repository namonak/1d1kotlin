package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1439Test : StringSpec({
    "뒤집기 : https://www.acmicpc.net/problem/1439" {
        val testCases = listOf(
            "0001100" to "1",
            "11111" to "0",
            "00000001" to "1",
            "11001100110011000001" to "4",
            "11101101" to "2"
        )

        testCases.forEach { (given, expected) ->
            No1439().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
