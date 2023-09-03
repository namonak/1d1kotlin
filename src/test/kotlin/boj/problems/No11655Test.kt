package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11655Test : StringSpec({
    "ROT13 : https://www.acmicpc.net/problem/11655" {
        val testCases = listOf(
            "Baekjoon Online Judge" to "Onrxwbba Bayvar Whqtr",
            "One is 1" to "Bar vf 1",
        )

        testCases.forEach { (input, output) ->
            No11655.solve(input) shouldBe output
        }
    }
})
