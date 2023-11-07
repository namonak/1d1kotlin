package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1449Test : StringSpec({
    "수리공 항승 : https://www.acmicpc.net/problem/1449" {
        val testCases = listOf(
            """
                4 2
                1 2 100 101
            """.trimIndent()
                to "2",
            """
                4 3
                1 2 3 4
            """.trimIndent()
                to "2",
            """
                3 1
                3 2 1
            """.trimIndent()
                to "3"
        )

        testCases.forEach { (given, expected) ->
            No1449.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
