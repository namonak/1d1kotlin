package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3034Test : StringSpec({
    "앵그리 창영 : https://www.acmicpc.net/problem/3034" {
        val testCases = listOf(
            """
                5 3 4
                3
                4
                5
                6
                7
            """.trimIndent()
                to """
                    DA
                    DA
                    DA
                    NE
                    NE
                """.trimIndent(),
            """
                2 12 17
                21
                20
            """.trimIndent()
                to """
                    NE
                    DA
                """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No3034().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
