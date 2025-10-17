package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2910Test : StringSpec({
    "빈도 정렬 : https://www.acmicpc.net/problem/2910" {
        val testCases = listOf(
            """
                5 2
                2 1 2 1 2
            """.trimIndent()
                to "2 2 2 1 1",
            """
                9 3
                1 3 3 3 2 2 2 1 1
            """.trimIndent()
                to "1 1 1 3 3 3 2 2 2",
            """
                9 77
                11 33 11 77 54 11 25 25 33
            """.trimIndent()
                to "11 11 11 33 33 25 25 77 54"
        )

        testCases.forEach { (given, expected) ->
            No2910().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
