package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14681Test : StringSpec({
    "사분면 고르기 테스트" {
        val testCases = listOf(
            """
                12
                5
            """.trimIndent() to "1",
            """
                9
                -13
            """.trimIndent() to "4"
        )

        testCases.forEach { (given, expected) ->
            No14681.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
