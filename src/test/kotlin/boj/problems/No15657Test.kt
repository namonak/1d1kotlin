package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15657Test : StringSpec({
    "N과 M (8) : https://www.acmicpc.net/problem/15657" {
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
                7 7
                7 8
                7 9
                8 8
                8 9
                9 9
            """.trimIndent(),
            """
                4 4
                1231 1232 1233 1234
            """.trimIndent() to """
                1231 1231 1231 1231
                1231 1231 1231 1232
                1231 1231 1231 1233
                1231 1231 1231 1234
                1231 1231 1232 1232
                1231 1231 1232 1233
                1231 1231 1232 1234
                1231 1231 1233 1233
                1231 1231 1233 1234
                1231 1231 1234 1234
                1231 1232 1232 1232
                1231 1232 1232 1233
                1231 1232 1232 1234
                1231 1232 1233 1233
                1231 1232 1233 1234
                1231 1232 1234 1234
                1231 1233 1233 1233
                1231 1233 1233 1234
                1231 1233 1234 1234
                1231 1234 1234 1234
                1232 1232 1232 1232
                1232 1232 1232 1233
                1232 1232 1232 1234
                1232 1232 1233 1233
                1232 1232 1233 1234
                1232 1232 1234 1234
                1232 1233 1233 1233
                1232 1233 1233 1234
                1232 1233 1234 1234
                1232 1234 1234 1234
                1233 1233 1233 1233
                1233 1233 1233 1234
                1233 1233 1234 1234
                1233 1234 1234 1234
                1234 1234 1234 1234
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No15657().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
