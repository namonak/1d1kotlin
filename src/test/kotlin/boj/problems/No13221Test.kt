package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No13221Test : StringSpec({
    "Manhattan : https://www.acmicpc.net/problem/13221" {
        val testCases = listOf(
            """
                1 1
                3
                0 5
                2 2
                4 3
            """.trimIndent() to "2 2",
            """
                41 77
                3
                19 81
                51 92
                30 65
            """.trimIndent() to "30 65"
        )

        testCases.forEach { (given, expected) ->
            No13221().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
