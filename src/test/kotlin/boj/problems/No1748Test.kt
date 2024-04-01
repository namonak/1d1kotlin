package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1748Test : StringSpec({
    "수 이어 쓰기 1 : https://www.acmicpc.net/problem/1748" {
        val testCases = listOf(
            "5" to "5",
            "15" to "21",
            "120" to "252"
        )

        testCases.forEach { (given, expected) ->
            No1748().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
