package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31495Test : StringSpec({
    "그게 무슨 코드니.. : https://www.acmicpc.net/problem/31495" {
        val testCases = listOf(
            "\"Hello World" to "CE",
            "\"Hello World\"" to "Hello World"
        )

        testCases.forEach { (given, expected) ->
            No31495().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
