package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27951Test : StringSpec({
    "옷걸이 : https://www.acmicpc.net/problem/27951" {
        val testCases = listOf(
            """
                5
                3 3 3 3 3
                2 3
            """.trimIndent() to """
                YES
                UUDDD
            """.trimIndent(),
            """
                5
                2 1 3 3 2
                2 3
            """.trimIndent() to """
                YES
                DUUDD
            """.trimIndent(),
            """
                3
                1 1 1
                0 3
            """.trimIndent() to """
                NO
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No27951().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
