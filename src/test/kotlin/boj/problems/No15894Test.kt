package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15894Test : StringSpec({
    "수학은 체육과목 입니다 : https://www.acmicpc.net/problem/15894" {
        val testCases = listOf(
            "1" to "4",
            "2" to "8",
            "3" to "12",
            "4" to "16",
            "100" to "400"
        )

        testCases.forEach { (given, expected) ->
            No15894().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
