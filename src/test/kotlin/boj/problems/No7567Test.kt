package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7567Test : StringSpec({
    "그릇 : https://www.acmicpc.net/problem/7567" {
        val testCases = listOf(
            "((((" to 25,
            "()()()))(" to 80
        )

        testCases.forEach { (input, output) ->
            No7567.solve(input) shouldBe output
        }
    }
})
