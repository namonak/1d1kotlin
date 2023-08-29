package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No4999Test : StringSpec({
    "아! : https://www.acmicpc.net/problem/4999" {
        val testCases = listOf(
            """
                aaah
                aaaaah
            """.trimIndent()
                to
                    "no",
            """
                aaah
                ah
            """.trimIndent()
                to
                    "go"
        )

        testCases.forEach { (input, expected) ->
            No4999.solve(BufferedReader(input.reader())) shouldBe expected
        }
    }
})
