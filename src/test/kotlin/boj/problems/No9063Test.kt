package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9063Test : StringSpec({
    "대지 : https://www.acmicpc.net/problem/9063" {
        val testCases = listOf(
            """
                3
                20 24
                40 21
                10 12
            """.trimIndent() to "360",
            """
                1
                15 13
            """.trimIndent() to "0",
            """
                4
                2 1
                3 2
                5 2
                3 4
            """.trimIndent() to "9"
        )

        testCases.forEach { (input, output) ->
            No9063().solve(input.reader().buffered()) shouldBe output
        }
    }
})
