package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1817Test : StringSpec({
    "짐 챙기는 숌 : https://www.acmicpc.net/problem/1817" {
        val testCases = listOf(
            """
                6 10
                5 5 5 5 5 5
            """.trimIndent() to "3",
            """
                5 100
                51 51 51 51 51
            """.trimIndent() to "5",
            """
                6 8
                1 1 1 7 7 7
            """.trimIndent() to "4",
            """
                11 12
                12 1 11 2 10 3 4 5 6 6 1
            """.trimIndent() to "6",
            """
                0 7
            """.trimIndent() to "0"
        )

        testCases.forEach { (input, expected) ->
            No1817().solve(input.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
