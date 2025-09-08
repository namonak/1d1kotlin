package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10205Test : StringSpec({
    "헤라클레스와 히드라 : https://www.acmicpc.net/problem/10205" {
        val testCases = listOf(
            """
                2
                10
                cbbbbccbb
                10
                bbbbbbbbbccbbb
            """.trimIndent() to """
                Data Set 1:
                7

                Data Set 2:
                0
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            val result = No10205().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
