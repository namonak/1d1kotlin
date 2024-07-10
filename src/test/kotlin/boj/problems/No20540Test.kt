package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20540Test : StringSpec({
    "연길이의 이상형 : https://www.acmicpc.net/problem/20540" {
        val testCases = listOf(
            "ESTJ" to "INFP",
            "INFP" to "ESTJ"
        )

        testCases.forEach { (given, expected) ->
            No20540().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
