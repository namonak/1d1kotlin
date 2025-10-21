package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29751Test : StringSpec({
    "삼각형 : https://www.acmicpc.net/problem/29751" {
        val testCases = listOf(
            "1 1" to "0.5",
            "2 3" to "3.0"
        )

        testCases.forEach { (given, expected) ->
            No29751().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
