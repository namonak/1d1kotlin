package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2783Test : StringSpec({
    "삼각 김밥 : https://www.acmicpc.net/problem/2783" {
        val testCases = listOf(
            """
                5 100
                3
                4 100
                3 100
                7 100
            """.trimIndent() to "30.00",
            """
                13 6
                5
                56 679
                35 120
                99 999
                56 73
                37 532
            """.trimIndent() to "69.55",
            """
                100 5
                3
                99 8
                65 14
                78 10
            """.trimIndent() to "4642.86"
        )

        testCases.forEach { (given, expected) ->
            No2783().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
