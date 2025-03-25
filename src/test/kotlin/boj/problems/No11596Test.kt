package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11596Test : StringSpec({
    "Triangle : https://www.acmicpc.net/problem/11596" {
        val testCases = listOf(
            """
                3 4 5
                4 3 5
            """.trimIndent() to "YES",
            """
                3 4 6
                4 6 3
            """.trimIndent() to "NO",
            """
                39 52 65
                25 60 65
            """.trimIndent() to "NO"
        )

        testCases.forEach { (given, expected) ->
            No11596().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
