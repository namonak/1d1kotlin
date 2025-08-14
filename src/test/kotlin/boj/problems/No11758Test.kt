package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11758Test : StringSpec({
    "CCW : https://www.acmicpc.net/problem/11758" {
        val testCases = listOf(
            """
                1 1
                5 5
                7 3
            """.trimIndent() to "-1",
            """
                1 1
                3 3
                5 5
            """.trimIndent() to "0",
            """
                1 1
                7 3
                5 5
            """.trimIndent() to "1"
        )

        testCases.forEach { (given, expected) ->
            val result = No11758().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
