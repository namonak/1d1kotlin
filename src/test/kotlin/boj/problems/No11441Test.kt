package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11441Test : StringSpec({
    "합 구하기 : https://www.acmicpc.net/problem/11441" {
        val testCases = listOf(
            """
                5
                10 20 30 40 50
                5
                1 3
                2 4
                3 5
                1 5
                4 4
            """.trimIndent() to """
                60
                90
                120
                150
                40
            """.trimIndent(),
            """
                3
                1 0 -1
                6
                1 1
                2 2
                3 3
                1 2
                2 3
                1 3
            """.trimIndent() to """
                1
                0
                -1
                1
                -1
                0
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No11441().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
