package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10988Test : StringSpec({
    "팰린드롬인지 확인하기 : https://www.acmicpc.net/problem/10988" {
        val testCases = listOf(
            "level" to "1",
            "baekjoon" to "0"
        )

        testCases.forEach { (given, expected) ->
            No10988().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
