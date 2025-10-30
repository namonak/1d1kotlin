package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1417Test : StringSpec({
    "국회의원 선거 : https://www.acmicpc.net/problem/1417" {
        val testCases = listOf(
            """
                3
                5
                7
                7
            """.trimIndent()
                to "2",
            """
                4
                10
                10
                10
                10
            """.trimIndent()
                to "1",
            """
                1
                1
            """.trimIndent()
                to "0",
            """
                5
                5
                10
                7
                3
                8
            """.trimIndent()
                to "4"
        )

        testCases.forEach { (given, expected) ->
            No1417().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
