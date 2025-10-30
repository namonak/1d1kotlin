package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2810Test : StringSpec({
    "컵홀더 : https://www.acmicpc.net/problem/2810" {
        val testCases = listOf(
            """
                3
                SSS
            """.trimIndent()
                to "3",
            """
                4
                SLLS
            """.trimIndent()
                to "4",
            """
                9
                SLLLLSSLL
            """.trimIndent()
                to "7"
        )

        testCases.forEach { (given, expected) ->
            No2810().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
