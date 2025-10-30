package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5618Test : StringSpec({
    "공약수 : https://www.acmicpc.net/problem/5618" {
        val testCases = listOf(
            """
                2
                75 125
            """.trimIndent() to
                """
                    1
                    5
                    25
                """.trimIndent(),
            """
                3
                110 22 88
            """.trimIndent() to
                """
                    1
                    2
                    11
                    22
                """.trimIndent(),
            """
                3
                66 11 3
            """.trimIndent() to
                """
                    1
                """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No5618().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
