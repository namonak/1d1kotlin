package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28062Test : StringSpec({
    "준석이의 사탕 사기 : https://www.acmicpc.net/problem/28062" {
        val testCases = listOf(
            """
                5
                8 3 6 7 5
            """.trimIndent()
                to "26",
            """
                1
                5
            """.trimIndent()
                to "0"
        )

        testCases.forEach { (given, expected) ->
            No28062().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
