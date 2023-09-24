package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18110Test : StringSpec({
    "solved.ac : https://www.acmicpc.net/problem/18110" {
        val testCases = listOf(
            """
                5
                1
                5
                5
                7
                8
            """.trimIndent()
                to 6,
            """
                10
                1
                13
                12
                15
                3
                16
                13
                12
                14
                15
            """.trimIndent()
                to 13
        )

        testCases.forEach { (input, expected) ->
            No18110.solve(input.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
