package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2491Test : StringSpec({
    "수열 : https://www.acmicpc.net/problem/2491" {
        val testCases = listOf(
            """
                9
                1 2 2 4 4 5 7 7 2
            """.trimIndent()
                to "8",
            """
                9
                4 1 3 3 2 2 9 2 3
            """.trimIndent()
                to "4",
            """
                11
                1 5 3 6 4 7 1 3 2 9 5
            """.trimIndent()
                to "2"
        )

        testCases.forEach { (given, expected) ->
            No2491().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
