package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No13222Test : StringSpec({
    "Matches : https://www.acmicpc.net/problem/13222" {
        val testCases = listOf(
            """
                5 3 4
                3
                4
                5
                6
                7
            """.trimIndent() to """
                YES
                YES
                YES
                NO
                NO
            """.trimIndent(),
            """
                2 12 17
                21
                20
            """.trimIndent() to """
                NO
                YES
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No13222().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
