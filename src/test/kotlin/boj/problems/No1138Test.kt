package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1138Test : StringSpec({
    "한 줄로 서기 : https://www.acmicpc.net/problem/1138" {
        val testCases = listOf(
            """
                4
                2 1 1 0
            """.trimIndent() to "4 2 1 3",
            """
                5
                0 0 0 0 0
            """.trimIndent() to "1 2 3 4 5",
            """
                6
                5 4 3 2 1 0
            """.trimIndent() to "6 5 4 3 2 1",
            """
                7
                6 1 1 1 2 0 0
            """.trimIndent() to "6 2 3 4 7 5 1"
        )

        testCases.forEach { (given, expected) ->
            No1138().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
