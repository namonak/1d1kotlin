package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No20044Test : StringSpec({
    "Project Teams : https://www.acmicpc.net/problem/20044" {
        val testCases = listOf(
            """
                2
                1 7 5 8
            """.trimIndent() to "9",
            """
                3
                1 7 3 5 9 2
            """.trimIndent() to "8"
        )

        testCases.forEach { (given, expected) ->
            No20044().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
