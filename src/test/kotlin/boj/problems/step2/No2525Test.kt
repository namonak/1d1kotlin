package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2525Test : StringSpec({
    "오븐 시계 테스트" {
        val testCases = listOf(
            """
                14 30
                20
            """.trimIndent() to "14 50",
            """
                17 40
                80
            """.trimIndent() to "19 0",
            """
                23 48
                25
            """.trimIndent() to "0 13"
        )

        testCases.forEach { (given, expected) ->
            No2525().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
