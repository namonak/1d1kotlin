package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16693Test : StringSpec({
    "Pizza Deal : https://www.acmicpc.net/problem/16693" {
        val testCases = listOf(
            """
                8 4
                7 9
            """.trimIndent()
                to "Whole pizza",
            """
                9 2
                4 7
            """.trimIndent()
                to "Whole pizza",
            """
                841 108
                8 606
            """.trimIndent()
                to "Slice of pizza"
        )

        testCases.forEach { (given, expected) ->
            No16693().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
