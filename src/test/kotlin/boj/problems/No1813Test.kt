package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1813Test : StringSpec({
    "논리학 교수 : https://www.acmicpc.net/problem/1813" {
        val testCases = listOf(
            """
                4
                0 1 2 3
            """.trimIndent()
                to "1",
            """
                1
                0
            """.trimIndent()
                to "-1",
            """
                6
                0 3 1 3 2 3
            """.trimIndent()
                to "3",
            """
                2
                1 1
            """.trimIndent()
                to "0"
        )

        testCases.forEach { (given, expected) ->
            No1813().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
