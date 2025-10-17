package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2441Test : StringSpec({
    "별 찍기 - 4 : https://www.acmicpc.net/problem/2441" {
        val testCases = listOf(
            "5" to """
                *****
                 ****
                  ***
                   **
                    *
            """.trimIndent(),
            "3" to """
                ***
                 **
                  *
            """.trimIndent(),
            "1" to """
                *
            """.trimIndent()
        )

        testCases.forEach { (input, output) ->
            No2441().solve(input.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
