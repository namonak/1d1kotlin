package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1068Test : StringSpec({
    "트리 : https://www.acmicpc.net/problem/1068" {
        val testCases = listOf(
            """
                5
                -1 0 0 1 1
                2
            """.trimIndent() to "2",
            """
                5
                -1 0 0 1 1
                1
            """.trimIndent() to "1",
            """
                5
                -1 0 0 1 1
                0
            """.trimIndent() to "0",
            """
                9
                -1 0 0 2 2 4 4 6 6
                4
            """.trimIndent() to "2"
        )

        testCases.forEach { (input, expected) ->
            val actual = No1068().solve(input.reader().buffered())
            actual shouldBe expected
        }
    }
})
