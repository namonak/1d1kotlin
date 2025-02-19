package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1434Test : StringSpec({
    "책 정리 : https://www.acmicpc.net/problem/1434" {
        val testCases = listOf(
            """
                3 3
                5 5 5
                5 5 5
            """.trimIndent() to "0",
            """
                3 3
                5 6 7
                5 5 5
            """.trimIndent() to "3",
            """
                3 1
                2 3 5
                3
            """.trimIndent() to "7",
            """
                4 5
                3 4 5 6
                3 3 3 3 3
            """.trimIndent() to "3"
        )

        testCases.forEach { (given, expected) ->
            No1434().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
