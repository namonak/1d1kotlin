package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30030Test : StringSpec({
    "스위트콘 가격 구하기 : https://www.acmicpc.net/problem/30030" {
        val testCases = listOf(
            "1100" to "1000",
            "2970" to "2700",
            "9900" to "9000"
        )

        testCases.forEach { (given, expected) ->
            No30030().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
