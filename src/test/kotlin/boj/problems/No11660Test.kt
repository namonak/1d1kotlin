package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11660Test : StringSpec({
    "구간 합 구하기 5 : https://www.acmicpc.net/problem/11660" {
        val testCases = listOf(
            """
                4 3
                1 2 3 4
                2 3 4 5
                3 4 5 6
                4 5 6 7
                2 2 3 4
                3 4 3 4
                1 1 4 4
            """.trimIndent() to """
                27
                6
                64
            """.trimIndent(),
            """
                2 4
                1 2
                3 4
                1 1 1 1
                1 2 1 2
                2 1 2 1
                2 2 2 2
            """.trimIndent() to """
                1
                2
                3
                4
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            val result = No11660().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
