package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11256Test : StringSpec({
    "사탕 : https://www.acmicpc.net/problem/11256" {
        val testCases = listOf(
            """
                1
                20 5
                3 4
                2 5
                1 8
                3 3
                2 5
            """.trimIndent() to """
                2
            """.trimIndent(),
            """
                2
                12 3
                2 7
                1 5
                3 2
                20 3
                2 7
                1 5
                3 2
            """.trimIndent() to """
                1
                2
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No11256().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
