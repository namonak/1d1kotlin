package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2953Test : StringSpec({
    "나는 요리사다 : https://www.acmicpc.net/problem/2953" {
        val testCases = listOf(
            """
                5 4 4 5
                5 4 4 4
                5 5 4 4
                5 5 5 4
                4 4 4 5
            """.trimIndent() to "4 19",
            """
                4 4 3 3
                5 4 3 5
                5 5 2 4
                5 5 5 1
                4 4 4 4
            """.trimIndent() to "2 17"
        )

        testCases.forEach { (given, expected) ->
            No2953().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
