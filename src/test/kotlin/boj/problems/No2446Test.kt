package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2446Test : StringSpec({
    "별 찍기 - 9 : https://www.acmicpc.net/problem/2446" {
        val testCases = listOf(
            "5" to """
                *********
                 *******
                  *****
                   ***
                    *
                   ***
                  *****
                 *******
                *********
            """.trimIndent(),
            "1" to """
                *
            """.trimIndent()
        )

        testCases.forEach { (input, output) ->
            No2446().solve(input.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
