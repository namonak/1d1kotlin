package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25644Test : StringSpec({
    "최대 상승 : https://www.acmicpc.net/problem/25644" {
        val testCases = listOf(
            """
                5
                4 2 3 1 5
            """.trimIndent() to "4",
            """
                3
                3 2 1
            """.trimIndent() to "0",
            """
                4
                7 1 2 6
            """.trimIndent() to "5"
        )

        testCases.forEach { (given, expected) ->
            No25644().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
