package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2217Test : StringSpec({
    "로프 : https://www.acmicpc.net/problem/2217" {
        val testCases = listOf(
            """
                2
                10
                15
            """.trimIndent() to "20",
            """
                5
                35
                33
                30
                20
                12
            """.trimIndent() to "90"
        )

        testCases.forEach { (given, expected) ->
            No2217().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
