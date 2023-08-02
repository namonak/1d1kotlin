package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5586Test : StringSpec({
    "JOI와 IOI : https://www.acmicpc.net/problem/5586" {
        val testCases = listOf(
            "JOIJOI" to "2\n0",
            "JOIOIOIOI" to "1\n3",
            "JOIOIJOINXNXJIOIOIOJ" to "2\n3",
        )

        testCases.forEach { (input, output) ->
            No5586.solve(input) shouldBe output
        }
    }
})
