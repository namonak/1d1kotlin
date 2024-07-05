package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No23303Test : StringSpec({
    "이 문제는 D2 입니다. : https://www.acmicpc.net/problem/23303" {
        val testCases = listOf(
            "naver d2" to "D2",
            "naver d3" to "unrated"

        )

        testCases.forEach { (given, expected) ->
            No23303().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
