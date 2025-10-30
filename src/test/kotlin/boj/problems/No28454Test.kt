package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28454Test : StringSpec({
    "Gift Expire Date : https://www.acmicpc.net/problem/28454" {
        val testCases = listOf(
            """
                2022-12-12
                2
                2022-12-12
                2023-12-12
            """.trimIndent() to "2",
            """
                2022-11-12
                2
                2022-12-12
                2023-12-12
            """.trimIndent() to "2",
            """
                2022-12-12
                5
                2020-11-11
                2022-07-11
                2022-12-30
                2023-01-01
                2023-01-01
            """.trimIndent() to "3"
        )

        testCases.forEach { (input, expected) ->
            No28454().solve(input.reader().buffered()) shouldBe expected
        }
    }
})
