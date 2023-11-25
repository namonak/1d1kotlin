package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15963Test : StringSpec({
    "CASIO : https://www.acmicpc.net/problem/15963" {
        val testCases = listOf(
            "1 1" to "1",
            "1 0" to "0"
        )

        testCases.forEach { (input, output) ->
            No15963.solve(input.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
