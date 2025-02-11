package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No28097Test : StringSpec({
    "모범생 포닉스 : https://www.acmicpc.net/problem/28097" {
        val testCases = listOf(
            """
                2
                12 12
            """.trimIndent() to "1 8",
            """
                1
                10
            """.trimIndent() to "0 10",
            """
                3
                10 11 11
            """.trimIndent() to "2 0"
        )

        testCases.forEach { (given, expected) ->
            No28097().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
