package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No21967Test : StringSpec({
    "세워라 반석 위에 : https://www.acmicpc.net/problem/21967" {
        val testCases = listOf(
            """
                5
                1 2 1 3 1
            """.trimIndent() to "5",
            """
                7
                1 2 3 4 2 5 7
            """.trimIndent() to "4"
        )

        testCases.forEach { (given, expected) ->
            val result = No21967().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
