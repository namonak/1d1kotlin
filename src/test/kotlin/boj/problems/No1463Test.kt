package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1463Test : StringSpec({
    "1로 만들기 : https://www.acmicpc.net/problem/1463" {
        val testCases = listOf(
            "2" to "1",
            "10" to "3"
        )

        testCases.forEach { (given, expected) ->
            No1463().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
