package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11444Test : StringSpec({
    "피보나치 수 6 : https://www.acmicpc.net/problem/11444" {
        val testCases = listOf(
            "0" to "0",
            "1" to "1",
            "2" to "1",
            "45" to "134903163",
            "1000" to "517691607",
            "1000000000000000000" to "209783453"
        )

        testCases.forEach { (given, expected) ->
            No11444().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
