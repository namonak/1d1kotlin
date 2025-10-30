package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11665Test : StringSpec({
    "Rectangular Prisms Intersection Volume : https://www.acmicpc.net/problem/11665" {
        val testCases = listOf(
            """
                2
                1 1 1 2 2 2
                2 2 2 3 3 3
            """.trimIndent() to "0",
            """
                2
                1 1 1 3 3 3
                2 2 2 3 3 3
            """.trimIndent() to "1",
            """
                2
                1 1 1 7 7 7
                2 3 4 7 8 9
            """.trimIndent() to "60",
            """
                3
                1 1 1 7 7 7
                2 3 4 7 8 9
                4 3 2 9 8 7
            """.trimIndent() to "36",
            """
                1
                1 2 3 4 5 6
            """.trimIndent() to "27",
        )

        testCases.forEach { (given, expected) ->
            val result = No11665().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
