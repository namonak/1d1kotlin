package boj.problems.step18

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1037Test : StringSpec({
    "약수 : https://www.acmicpc.net/problem/1037" {
        val testCases = listOf(
            """
                2
                4 2
            """.trimIndent() to "8",
            """
                1
                2
            """.trimIndent() to "4",
            """
                6
                3 4 2 12 6 8
            """.trimIndent() to "24",
            """
                14
                14 26456 2 28 13228 3307 7 23149 8 6614 46298 56 4 92596
            """.trimIndent() to "185192"
        )

        testCases.forEach { (given, expected) ->
            val actual = No1037().solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
