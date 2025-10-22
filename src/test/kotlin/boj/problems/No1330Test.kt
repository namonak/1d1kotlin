package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1330Test : StringSpec({
    "두 수 비교하기 테스트 : https://www.acmicpc.net/problem/1330" {
        val testCases = listOf(
            "1 2" to "<",
            "10 2" to ">",
            "5 5" to "==",
        )

        testCases.forEach { (given, expected) ->
            No1330().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
