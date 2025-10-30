package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15654Test : StringSpec({
    "N과 M (5) : https://www.acmicpc.net/problem/15654" {
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
                1 7
                1 8
                1 9
                7 1
                7 8
                7 9
                8 1
                8 7
                8 9
                9 1
                9 7
                9 8
            """.trimIndent(),
            """
                4 4
                1231 1232 1233 1234
            """.trimIndent() to """
                1231 1232 1233 1234
                1231 1232 1234 1233
                1231 1233 1232 1234
                1231 1233 1234 1232
                1231 1234 1232 1233
                1231 1234 1233 1232
                1232 1231 1233 1234
                1232 1231 1234 1233
                1232 1233 1231 1234
                1232 1233 1234 1231
                1232 1234 1231 1233
                1232 1234 1233 1231
                1233 1231 1232 1234
                1233 1231 1234 1232
                1233 1232 1231 1234
                1233 1232 1234 1231
                1233 1234 1231 1232
                1233 1234 1232 1231
                1234 1231 1232 1233
                1234 1231 1233 1232
                1234 1232 1231 1233
                1234 1232 1233 1231
                1234 1233 1231 1232
                1234 1233 1232 1231
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No15654().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
