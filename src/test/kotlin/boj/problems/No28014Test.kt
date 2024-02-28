package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28014Test : StringSpec({
    "첨탑 밀어서 부수기 : https://www.acmicpc.net/problem/28014" {
        val testCases = listOf(
            """
                6
                1 3 2 5 8 1
            """.trimIndent()
                to "4",
            """
                8
                1 2 3 4 5 6 7 8
            """.trimIndent()
                to "8",
            """
                5
                5 4 3 2 1
            """.trimIndent()
                to "1"
        )

        testCases.forEach { (given, expected) ->
            No28014.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
