package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1874Test : StringSpec({
    "스택 수열 : https://www.acmicpc.net/problem/1874" {
        val testCases = listOf(
            """
                8
                4
                3
                6
                8
                7
                5
                2
                1
            """.trimIndent() to """
                +
                +
                +
                +
                -
                -
                +
                +
                -
                +
                +
                -
                -
                -
                -
                -
            """.trimIndent(),
            """
                5
                1
                2
                5
                3
                4
            """.trimIndent() to "NO"
        )

        testCases.forEach { (given, expected) ->
            No1874().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
