package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10250Test : StringSpec({
    "ACM 호텔 : https://www.acmicpc.net/problem/10250" {
        val testCases = listOf(
            """
                2
                6 12 10
                30 50 72
            """.trimIndent() to """
                402
                1203
            """.trimIndent(),
            """
                2
                10 10 100
                99 99 9801
            """.trimIndent() to """
                1010`
                9999
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No10250.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
