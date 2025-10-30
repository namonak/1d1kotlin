package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2153Test : StringSpec({
    "소수 단어 : https://www.acmicpc.net/problem/2153" {
        val testCases = listOf(
            "UFRN" to "It is a prime word.",
            "contest" to "It is not a prime word."
        )

        testCases.forEach { (input, expected) ->
            No2153().solve(input.reader().buffered()) shouldBe expected
        }
    }
})
