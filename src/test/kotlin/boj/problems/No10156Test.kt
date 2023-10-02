package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10156Test : StringSpec({
    "과자 : https://www.acmicpc.net/problem/10156" {
        val testCases = listOf(
            "300 4 1000" to 200,
            "250 2 140" to 360,
            "20 6 120" to 0,
            "20 10 320" to 0
        )

        testCases.forEach { (input, output) ->
            No10156.solve(input.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
