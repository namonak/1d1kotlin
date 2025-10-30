package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15656Test : StringSpec({
    "N과 M (7) : https://www.acmicpc.net/problem/15656" {
        val testCases = listOf(
            """
                3 1
                4 5 2
            """.trimIndent() to """
                2
                4
                5
            """.trimIndent(),
            """
                4 2
                9 8 7 1
            """.trimIndent() to """
                1 1
                1 7
                1 8
                1 9
                7 1
                7 7
                7 8
                7 9
                8 1
                8 7
                8 8
                8 9
                9 1
                9 7
                9 8
                9 9
            """.trimIndent(),
            """
                3 3
                1231 1232 1233
            """.trimIndent() to """
                1231 1231 1231
                1231 1231 1232
                1231 1231 1233
                1231 1232 1231
                1231 1232 1232
                1231 1232 1233
                1231 1233 1231
                1231 1233 1232
                1231 1233 1233
                1232 1231 1231
                1232 1231 1232
                1232 1231 1233
                1232 1232 1231
                1232 1232 1232
                1232 1232 1233
                1232 1233 1231
                1232 1233 1232
                1232 1233 1233
                1233 1231 1231
                1233 1231 1232
                1233 1231 1233
                1233 1232 1231
                1233 1232 1232
                1233 1232 1233
                1233 1233 1231
                1233 1233 1232
                1233 1233 1233
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No15656().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
