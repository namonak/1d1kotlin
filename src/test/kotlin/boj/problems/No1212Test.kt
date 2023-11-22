package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1212Test : StringSpec({
    "8진수 2진수 : https://www.acmicpc.net/problem/1212" {
        val testCases = listOf(
            "314" to "11001100",
            "7" to "111",
            "0" to "0",
            "767676767676" to "111110111110111110111110111110111110"
        )

        testCases.forEach { (input, output) ->
            No1212.solve(input.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
