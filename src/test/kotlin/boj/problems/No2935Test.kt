package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2935Test : StringSpec({
    "소음 : https://www.acmicpc.net/problem/2935" {
        val testCases = listOf(
            """
                1000
                *
                100
            """.trimIndent()
                to
                    100000.toBigInteger(),
            """
                10000
                +
                10
            """.trimIndent()
                to
                    10010.toBigInteger(),
            """
                10
                +
                1000
            """.trimIndent()
                to
                    1010.toBigInteger(),
            """
                1
                *
                1000
            """.trimIndent()
                to
                    1000.toBigInteger()
        )

        testCases.forEach { (input, expected) ->
            No2935.solve(BufferedReader(input.reader())) shouldBe expected
        }
    }
})
