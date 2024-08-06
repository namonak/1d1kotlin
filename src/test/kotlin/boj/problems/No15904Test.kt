package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15904Test : StringSpec({
    "UCPC는 무엇의 약자일까? : https://www.acmicpc.net/problem/15904" {
        val testCases = listOf(
            "Union of Computer Programming Contest club contest" to "I love UCPC",
            "University Computer Programming" to "I hate UCPC"
        )

        testCases.forEach { (given, expected) ->
            No15904().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
